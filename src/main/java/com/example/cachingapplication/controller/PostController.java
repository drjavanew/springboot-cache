package com.example.cachingapplication.controller;

import com.example.cachingapplication.domain.entity.Post;
import com.example.cachingapplication.service.PostService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }


    @GetMapping(value="/posts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Post findById(@PathVariable("id") Integer postId) {
        return service.findById(postId);
    }

    @PostMapping(value="/updatepost", produces = MediaType.APPLICATION_JSON_VALUE)
    public void updatePost(Post post) {
        service.updatePost(post);
    }

    @DeleteMapping(value="/posts/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteById(@PathVariable("id") Integer postId) {
        service.deleteById(postId);
    }
}
