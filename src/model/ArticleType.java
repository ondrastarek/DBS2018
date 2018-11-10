package model;

public class ArticleType {

    private int id;
    private String articleTypeName;

    public ArticleType(int id, String articleTypeName) {
        this.id = id;
        this.articleTypeName = articleTypeName;
    }

    public int getId() {
        return id;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }
}
