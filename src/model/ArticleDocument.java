package model;

import java.time.LocalDate;

public class ArticleDocument {

    private int id;
    private String link;
    private DocumentType documentType;
    private LocalDate documentDate;

    public ArticleDocument(int id, String link, DocumentType documentType, LocalDate documentDate) {
        this.id = id;
        this.link = link;
        this.documentType = documentType;
        this.documentDate = documentDate;
    }

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }
}
