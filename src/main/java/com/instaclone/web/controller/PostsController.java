package com.instaclone.web.controller;

import com.instaclone.web.dto.PostsResponseDto;
import com.instaclone.web.dto.PostsSaveRequestDto;
import com.instaclone.web.dto.PostsUpdateRequestDto;
import com.instaclone.web.service.PostsService;
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
