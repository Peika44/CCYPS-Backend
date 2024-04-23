package org.example.ccypsbackend;

import jakarta.annotation.Resource;
import org.example.ccypsbackend.post.dao.repo.PostRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JTest {
    @Test
    void contextLoads() {
        System.out.println("Hello World");
    }

//    @Resource
//    PostRepository postRepository;
//    @Test
//    void testSimpleSelect(){
//        postRepository.findById(1L);
//    }
}
