import requests
import base64
from azure.cosmos import CosmosClient

# SonarQube setup
SONAR_URL = "http://localhost:9000"
PROJECT_KEY = "qhub-backend"
SONAR_TOKEN = "squ_f52ff401d102b23adbeedb133a608206d375281c"

# Base64 encode Sonar token
encoded_token = base64.b64encode(f"{SONAR_TOKEN}:".encode()).decode()
headers = {
    "Authorization": f"Basic {encoded_token}"
}

# Cosmos DB setup
cosmos_endpoint = "https://sonarqubecosmos.documents.azure.com:443/"
# placeholder for secret
client = CosmosClient(cosmos_endpoint, cosmos_key)
database = client.get_database_client("sonarqube_id")
container = database.get_container_client("sonarqube_metrics")

# Metrics to fetch
metrics = ",".join([
    "bugs", "vulnerabilities", "code_smells",
    "duplicated_lines_density", "security_hotspots",
    "reliability_rating", "security_rating", "sqale_rating"
])

# Call API
response = requests.get(
    f"{SONAR_URL}/api/measures/component?component={PROJECT_KEY}&metricKeys={metrics}",
    headers=headers
)

# Safety check
if response.status_code != 200:
    print("❌ Failed to fetch metrics:", response.status_code)
    print(response.text)
    exit(1)

# Parse response
measures = response.json()["component"]["measures"]
metrics_dict = {m['metric']: m['value'] for m in measures}

def get_rating(val):
    return {
        "1.0": "A", "2.0": "B", "3.0": "C", "4.0": "D", "5.0": "E"
    }.get(val, "N/A")

# Prepare document
document = {
    "id": PROJECT_KEY,
    "project": PROJECT_KEY,
    "bugs": int(metrics_dict.get("bugs", 0)),
    "vulnerabilities": int(metrics_dict.get("vulnerabilities", 0)),
    "security_hotspots": int(metrics_dict.get("security_hotspots", 0)),
    "code_smells": int(metrics_dict.get("code_smells", 0)),
    "duplications": float(metrics_dict.get("duplicated_lines_density", 0.0)),
    "ratings": {
        "reliability": get_rating(metrics_dict.get("reliability_rating")),
        "security": get_rating(metrics_dict.get("security_rating")),
        "maintainability": get_rating(metrics_dict.get("sqale_rating")),
        "security_review": "E"  # Static fallback or future enhancement
    }
}

# Insert into Cosmos DB
container.upsert_item(document)
print("✅ SonarQube metrics pushed to Cosmos DB successfully.")
