package model;

import java.time.LocalDate;

public class ServiceProtocol {

    private int id;
    private LocalDate date;
    private String link;
    private ServiceType serviceType;
    private ServiceFirm serviceFirm;

    public ServiceProtocol(int id, LocalDate date, String link, ServiceType serviceType, ServiceFirm serviceFirm) {
        this.id = id;
        this.date = date;
        this.link = link;
        this.serviceType = serviceType;
        this.serviceFirm = serviceFirm;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getLink() {
        return link;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public ServiceFirm getServiceFirm() {
        return serviceFirm;
    }
}
