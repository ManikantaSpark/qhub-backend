package com.example.qhub.domain.model;

public class TestMaintenanceData {
    private String month;
    private int maintained;
    private int created;
    private int deprecated;
    private int debt;

    public TestMaintenanceData(String month, int maintained, int created, int deprecated, int debt) {
        this.month = month;
        this.maintained = maintained;
        this.created = created;
        this.deprecated = deprecated;
        this.debt = debt;
    }
    public String getMonth() { return month; }
    public int getMaintained() { return maintained; }
    public int getCreated() { return created; }
    public int getDeprecated() { return deprecated; }
    public int getDebt() { return debt; }
}
