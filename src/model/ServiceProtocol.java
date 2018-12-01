package model;

import java.time.LocalDate;

public class ServiceProtocol {

    private int id;
    private LocalDate date;
    private String link;
    private boolean planned;
    private ServiceFirm serviceFirm;

    public ServiceProtocol(int id, LocalDate date, String link, boolean planned, ServiceFirm serviceFirm) {
        this.id = id;
        this.date = date;
        this.link = link;
        this.planned = planned;
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

    public boolean wasPlanned() {
        return planned;
    }

    public ServiceFirm getServiceFirm() {
        return serviceFirm;
    }
}
