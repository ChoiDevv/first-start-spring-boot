package com.instaclone.web.controller;

import com.instaclone.web.dto.PostsSaveRequestDto;
import com.instaclone.web.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        return postsService.savePosts(postsSaveRequestDto);
    }
}
