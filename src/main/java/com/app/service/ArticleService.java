package com.app.service;

import com.app.model.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();

    Article getArticleById(long id);

    void saveOrUpdate(Article article);

    void deleteArticle(long id);


}
