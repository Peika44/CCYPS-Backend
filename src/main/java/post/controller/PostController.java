package post.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import post.controller.param.PostParam;
import utils.Result;

@RestController
@RequestMapping("/api/post")
@CrossOrigin
public class PostController {

    @GetMapping
    public String findAllPosts(){
        System.out.println("findAllPosts");
        return "findAllPosts";
    }

    @GetMapping("/findPostById")
    public Long findPostById(@RequestParam Long postId){
        System.out.println(postId);
        return postId;
    }

    @GetMapping("/{postId}")
    public Long findPostByIdWithPathVar(@PathVariable Long postId){
        System.out.println(postId);
        return postId;
    }

    @PostMapping("/addPost")
    public Result addPost(@RequestBody @Validated PostParam postParam){
        System.out.println(postParam);
        return Result.ok().data("data",postParam);
    }
}