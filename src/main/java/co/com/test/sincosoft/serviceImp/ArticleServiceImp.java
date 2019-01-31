package co.com.test.sincosoft.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.test.sincosoft.model.Article;
import co.com.test.sincosoft.repositories.ArticleRepository;
import co.com.test.sincosoft.service.ArticleService;

@Service
public class ArticleServiceImp implements ArticleService {
	
private ArticleRepository articleRepository;
	
	@Autowired
	public ArticleServiceImp(ArticleRepository articleRepository) {
		this.articleRepository = articleRepository;
	}
	
	public List<Article> articleList(){
		return articleRepository.findAll();
	}
	
	public Article findOne(Long id) {
		return articleRepository.findOne(id);
	}
	
	public Article addArticle(Article article) {
		return articleRepository.save(article);
	}
	
	public String deleteArticle(Long id) {
		articleRepository.delete(id);
		return "{'message':'Articulo eliminado correctamente}";
	}
}
