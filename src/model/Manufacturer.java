package model;

public class Manufacturer {

    private int id;
    private String name;
    private String phoneNumber;

    public Manufacturer(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
