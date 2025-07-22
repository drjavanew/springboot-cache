package com.example.cachingapplication.service;

import com.example.cachingapplication.domain.entity.Post;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Cacheable("posts")
    public Post findById(Integer postId) {
        int count = 0;
        System.out.println("Fetching Post - " + ++count);
        return new Post(postId, "Demo post");
    }

    @CachePut("posts")
    public void updatePost(Post post) {
        // update post
    }
    @CacheEvict("posts")
    public void deleteById(Integer postId) {
        // delete post
    }
}
