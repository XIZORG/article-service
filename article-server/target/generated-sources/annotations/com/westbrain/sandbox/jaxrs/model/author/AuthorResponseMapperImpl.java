package com.westbrain.sandbox.jaxrs.model.author;

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
public class AuthorResponseMapperImpl implements AuthorResponseMapper {

    @Override
    public AuthorResponse authorToAuthorResponse(Author source) {
        if ( source == null ) {
            return null;
        }

        AuthorResponse authorResponse = new AuthorResponse();

        authorResponse.setName( source.getName() );
        authorResponse.setId( source.getId() );

        return authorResponse;
    }

    @Override
    public Author authorResponseToAuthor(AuthorResponse destination) {
        if ( destination == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( destination.getId() );
        author.setName( destination.getName() );

        return author;
    }

    @Override
    public AuthorGetResponse authorToGetResponse(Author source) {
        if ( source == null ) {
            return null;
        }

        AuthorGetResponse authorGetResponse = new AuthorGetResponse();

        authorGetResponse.setName( source.getName() );
        authorGetResponse.setId( source.getId() );
        Set<Article> set = source.getArticles();
        if ( set != null ) {
            authorGetResponse.setArticles( new HashSet<Article>( set ) );
        }

        return authorGetResponse;
    }

    @Override
    public Author getResponseToAuthor(AuthorGetResponse destination) {
        if ( destination == null ) {
            return null;
        }

        Author author = new Author();

        author.setId( destination.getId() );
        author.setName( destination.getName() );
        Set<Article> set = destination.getArticles();
        if ( set != null ) {
            author.setArticles( new HashSet<Article>( set ) );
        }

        return author;
    }

    @Override
    public Author authorRequestToAuthor(AuthorRequest authorRequest) {
        if ( authorRequest == null ) {
            return null;
        }

        Author author = new Author();

        author.setName( authorRequest.getName() );

        return author;
    }
}
