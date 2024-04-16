package org.example.ccypsbackend.post.dao.repo;

import org.example.ccypsbackend.post.dao.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
