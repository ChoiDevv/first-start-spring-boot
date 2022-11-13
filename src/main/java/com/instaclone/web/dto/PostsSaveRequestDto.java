package com.instaclone.web.dto;

import com.instaclone.web.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostsSaveRequestDto {

    private final String title;
    private final String content;
    private final String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
