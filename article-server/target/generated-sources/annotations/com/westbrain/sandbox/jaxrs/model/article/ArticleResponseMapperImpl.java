package com.westbrain.sandbox.jaxrs.model.article;

import com.westbrain.sandbox.jaxrs.entity.Article;
import com.westbrain.sandbox.jaxrs.entity.Author;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-28T10:43:30+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Eclipse Foundation)"
)
public class ArticleResponseMapperImpl implements ArticleResponseMapper {

    @Override
    public ArticleResponse articleToArticleResponse(Article source) {
        if ( source == null ) {
            return null;
        }

        ArticleResponse articleResponse = new ArticleResponse();

        articleResponse.setDescription( source.getDescription() );
        articleResponse.setName( source.getName() );
        articleResponse.setId( source.getId() );
        Set<Author> set = source.getAuthors();
        if ( set != null ) {
            articleResponse.setAuthors( new HashSet<Author>( set ) );
        }

        return articleResponse;
    }

    @Override
    public Article articleResponseToArtilce(ArticleResponse destination) {
        if ( destination == null ) {
            return null;
        }

        Article article = new Article();

        article.setId( destination.getId() );
        article.setName( destination.getName() );
        article.setDescription( destination.getDescription() );
        Set<Author> set = destination.getAuthors();
        if ( set != null ) {
            article.setAuthors( new HashSet<Author>( set ) );
        }

        return article;
    }
}
