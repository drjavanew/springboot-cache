package com.example.cachingapplication.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Post implements Serializable {
    private Integer postId;

    private String title;

    public Post(Integer postId, String title)
    {
        this.postId = postId;
        this.title = title;
    }

    public String toString(){
        return "Posting";
    }
}
