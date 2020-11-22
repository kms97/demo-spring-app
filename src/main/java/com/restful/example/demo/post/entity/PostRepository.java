package com.restful.example.demo.post.entity;

import com.restful.example.demo.post.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
