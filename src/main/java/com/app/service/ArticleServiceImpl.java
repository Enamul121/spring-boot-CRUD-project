package com.app.service;

import com.app.model.Article;
import com.app.repo.ArticleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {


    @Autowired
    ArticleRepo articleRepo;


    @Override
    public List<Article> getAllArticles() {

         return (List<Article>) articleRepo.findAll();
    }


    @Override
    public Article getArticleById(long id) {
        return articleRepo.findById(id).get();
    }


    @Override
    public void saveOrUpdate(Article article) {
        articleRepo.save(article);
    }


    @Override
    public void deleteArticle(long id) {

        articleRepo.deleteById(id);
    }
}
