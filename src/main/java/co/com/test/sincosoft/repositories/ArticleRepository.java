package co.com.test.sincosoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.test.sincosoft.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
