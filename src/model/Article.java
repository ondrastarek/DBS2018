package model;

import java.time.LocalDate;
import java.util.List;

public class Article {

    private int id;
    private Product product;
    private Distributor distributor;
    private Security security;
    private ArticleType articleType;
    private String UMDNS;
    private LocalDate buyDate;
    private int checkPeriod;
    private ArticleStatus articleStatus;
    private String note;
    private Section section;
    private List<ServiceProtocol> protocolList;
    private List<ArticleDocument> documentList;
    private double price;

    public Article(int id, Product product, Distributor distributor, Security security, ArticleType articleType,
                   String UMDNS, LocalDate buyDate, int checkPeriod, ArticleStatus articleStatus, String note,
                   Section section, List<ServiceProtocol> protocolList, List<ArticleDocument> documentList, double price) {
        this.id = id;
        this.product = product;
        this.distributor = distributor;
        this.security = security;
        this.articleType = articleType;
        this.UMDNS = UMDNS;
        this.buyDate = buyDate;
        this.checkPeriod = checkPeriod;
        this.articleStatus = articleStatus;
        this.note = note;
        this.section = section;
        this.protocolList = protocolList;
        this.documentList = documentList;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public Distributor getDistributor() {
        return distributor;
    }

    public Security getSecurity() {
        return security;
    }

    public ArticleType getArticleType() {
        return articleType;
    }

    public String getUMDNS() {
        return UMDNS;
    }

    public LocalDate getBuyDate() {
        return buyDate;
    }

    public int getCheckPeriod() {
        return checkPeriod;
    }

    public ArticleStatus getArticleStatus() {
        return articleStatus;
    }

    public String getNote() {
        return note;
    }

    public Section getSection() {
        return section;
    }

    public List<ServiceProtocol> getProtocolList() {
        return protocolList;
    }

    public List<ArticleDocument> getDocumentList() {
        return documentList;
    }

    public double getPrice() {
        return price;
    }
}
