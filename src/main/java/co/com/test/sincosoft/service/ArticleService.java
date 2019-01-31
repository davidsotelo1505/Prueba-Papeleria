package co.com.test.sincosoft.service;

import java.util.List;

import co.com.test.sincosoft.model.Article;

public interface ArticleService {
	
	List<Article> articleList();
	
	Article findOne(Long id);
	
	Article addArticle(Article article);
	
	String deleteArticle(Long id);
	
}