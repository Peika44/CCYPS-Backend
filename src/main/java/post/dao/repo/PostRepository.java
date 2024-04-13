package post.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import post.dao.entity.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
