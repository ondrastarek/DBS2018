package model;

import java.time.LocalDate;

public class ArticleStatus {

    private int id;
    private String statusName;
    private LocalDate statusSince;

    public ArticleStatus(int id, String statusName, LocalDate statusSince) {
        this.id = id;
        this.statusName = statusName;
        this.statusSince = statusSince;
    }

    public int getId() {
        return id;
    }

    public String getStatusName() {
        return statusName;
    }

    public LocalDate getStatusSince() {
        return statusSince;
    }

}
