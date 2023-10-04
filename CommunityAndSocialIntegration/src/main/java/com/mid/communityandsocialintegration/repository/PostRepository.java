package com.mid.communityandsocialintegration.repository;

import com.mid.communityandsocialintegration.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
