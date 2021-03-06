package com.ximingxing.blog.system.repository;

import com.ximingxing.blog.system.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Description: ArticleRepository
 * Created By xxm
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
