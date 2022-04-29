package com.lgh.springbootwebservice.web.dto;

import com.lgh.springbootwebservice.web.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsListResponseDto {

    private Long id;
    private String title;
    private String author;
    private String content;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.content = entity.getContent();
    }
}
