package model;

public class Product {

    private int id;
    private Manufacturer manufacturer;
    private String serialNumber;
    private String name;

    public Product(int id, Manufacturer manufacturer, String serialNumber, String name) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }
}
