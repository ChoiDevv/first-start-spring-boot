package com.practice.web.dto;

import com.practice.web.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Long id, String title, String author, LocalDateTime modifiedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.modifiedDate = modifiedDate;
    }

    public PostsListResponseDto(Posts list) {
        this.id = list.getId();
        this.title = list.getTitle();
        this.author = list.getAuthor();
        this.modifiedDate = list.getModifiedDate();
    }
}
