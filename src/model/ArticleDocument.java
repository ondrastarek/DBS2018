package model;

import java.time.LocalDate;

public class ArticleDocument {

    private int id;
    private String link;
    private String documentName;
    private LocalDate documentDate;

    public ArticleDocument(int id, String link, String documentName, LocalDate documentDate) {
        this.id = id;
        this.link = link;
        this.documentName = documentName;
        this.documentDate = documentDate;
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getDocumentName() {
        return documentName;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }
}
