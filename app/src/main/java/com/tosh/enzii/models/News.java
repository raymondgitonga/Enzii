package com.tosh.enzii.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {
    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("totalResult")
    @Expose
    private int totalResult;

    @SerializedName("articles")
    @Expose
    private List<Article> article;

    public News(String status, int totalResult, List<Article> article) {
        this.status = status;
        this.totalResult = totalResult;
        this.article = article;
    }

    public String getStatus() {
        return status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public List<Article> getArticle() {
        return article;
    }
}
