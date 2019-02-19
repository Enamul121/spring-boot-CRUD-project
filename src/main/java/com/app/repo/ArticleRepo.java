package com.app.repo;

import com.app.model.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository<Article,Long> {

}
