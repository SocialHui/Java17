package models.vo;

import models.ArticleInfo;

public class ArticleInfoVO extends ArticleInfo {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        this.username = userName;
    }
}
