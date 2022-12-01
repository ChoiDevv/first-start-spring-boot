package com.practice.web.controller;

import com.practice.web.dto.PostsResponseDto;
import com.practice.web.dto.PostsSaveRequestDto;
import com.practice.web.dto.PostsUpdateRequestDto;
import com.practice.web.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PostsController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto postsSaveRequestDto) {
        return postsService.savePosts(postsSaveRequestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long updatePosts(@PathVariable Long id, @RequestBody PostsUpdateRequestDto postsUpdateRequestDto) {
        return postsService.updatePosts(id, postsUpdateRequestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto getPosts(@PathVariable Long id) {
        return postsService.getPosts(id);
    }
}
