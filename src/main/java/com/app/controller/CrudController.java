package com.app.controller;


import com.app.model.Article;
import com.app.service.ArticleService;
import com.app.service.ArticleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CrudController {

    @Autowired
    ArticleService articleService;


    @GetMapping("/")
    public ModelAndView wc(){
        ModelAndView modelAndView = new ModelAndView("wc");
        return modelAndView;
    }


    @GetMapping("/list")
    public ModelAndView articleList(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("article_list");
        List<Article> articleLists = articleService.getAllArticles();

        modelAndView.addObject("articleLists", articleLists);
        return modelAndView;
    }

    @GetMapping("/addArticle")
    public ModelAndView addArticle(){
        ModelAndView model = new ModelAndView();
        Article article = new Article();
        model.addObject("articleForm", article);
        model.setViewName("form");
        return model;
    }

    // INSER DATA
    @PostMapping("/saveArticle")
    public ModelAndView save(@ModelAttribute("articleForm") Article article){

        articleService.saveOrUpdate(article);

        return new ModelAndView("redirect:/list");
    }

    // DELETE DATA
    @GetMapping("/deleteArticle/{id}")
    public ModelAndView deleteArticle(@PathVariable long id){
        articleService.deleteArticle(id);
        return new ModelAndView("redirect:/list");
    }


    // UPDATE DATA
    @GetMapping("/updateArticle/{id}")
    public ModelAndView updateArticle(@PathVariable long id){

        ModelAndView modelAndView = new ModelAndView();
        Article article = articleService.getArticleById(id);
        modelAndView.addObject("articleForm", article);
        modelAndView.setViewName("form");
        return modelAndView;
    }



}
