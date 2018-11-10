package model;

public class Security {

    private int id;
    private String securityName;

    public Security(int id, String securityName) {
        this.id = id;
        this.securityName = securityName;
    }

    public int getId() {
        return id;
    }

    public String getSecurityName() {
        return securityName;
    }
}
