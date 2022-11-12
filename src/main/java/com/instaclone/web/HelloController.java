package com.instaclone.web;

import com.instaclone.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/check")
    public String check() {
        return "Check Completed";
    }

    @GetMapping("/check/dto")
    public HelloResponseDto checkDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
