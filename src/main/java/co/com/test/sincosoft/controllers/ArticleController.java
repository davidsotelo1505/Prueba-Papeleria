package co.com.test.sincosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.test.sincosoft.model.Article;
import co.com.test.sincosoft.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
		private  ArticleService articleService;
		
		@Autowired
		public ArticleController(ArticleService articleService) {
			this.articleService = articleService;
		}
		
		@RequestMapping("/delete/{id}")
		public String deleteArticle(@PathVariable Long id) {
			return articleService.deleteArticle(id);
		}
		
		@RequestMapping("/add")
		public Article addArticle(@RequestBody Article article) {
			return articleService.addArticle(article);
		}
		
		@RequestMapping("/list")
		public List<Article> articleService(){
			return articleService.articleList();
		}
		
		@RequestMapping("/get/{id}")
		public Article getArticle(@PathVariable Long id) {
			return articleService.findOne(id);
		}
}
