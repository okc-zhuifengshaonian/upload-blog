package com.example.axios;

import com.example.axios.Blog;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("blog")
@CrossOrigin   //解决跨域请求问题
public class BlogController {
    @PostMapping
    public void saveBlog(@RequestBody Blog blog) {
        System.out.println(blog.toString());
    }
}



