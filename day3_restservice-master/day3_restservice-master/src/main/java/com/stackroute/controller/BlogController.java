package com.stackroute.controller;

import com.stackroute.domain.Blog;
import com.stackroute.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */

/**
 * RequestMapping annotation maps HTTP requests to handler methods
 */
@RestController
@RequestMapping("/api/v1")
public class BlogController {

    private BlogService blogService;

    @Autowired
    public BlogController(BlogService blogService) {

        this.blogService = blogService;
    }

    /**
     * save a new blog
     */
    @PostMapping("/blog")
    public ResponseEntity<Blog> saveBlog(@RequestBody Blog blog) {
        Blog savedBlog=blogService.saveBlog(blog);
        if(savedBlog!=null){
            return new ResponseEntity<>(savedBlog,HttpStatus.CREATED);
        }
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        
    }

    /**
     * retrieve all blogs
     */
    @GetMapping("/blogs")
    public ResponseEntity<List<Blog>> getAllBlogs() {
        List<Blog> blogList=blogService.getAllBlogs();
        if(!blogList.isEmpty()){
            return new ResponseEntity<>(blogList,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /**
     * retrieve blog by id
     */
    @GetMapping("blog/{blogId}")
    public ResponseEntity<Blog> getBlogById(@PathVariable("blogId") int blogId) {

      Blog bg=  blogService.getBlogById(blogId);
      if(bg!=null) {
          return new ResponseEntity<>(bg, HttpStatus.OK);
      }
       return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    /**
     * delete blog by id
     */
    @DeleteMapping("blog/{blogId}")
    public ResponseEntity<Blog> getBlogAfterDeleting(@PathVariable("blogId") int blogId) {
        return new ResponseEntity<>(blogService.deleteBlog(blogId),HttpStatus.OK);



    }


    /**
     * update blog
     */
    @PutMapping("blog")
    public ResponseEntity<Blog> updateBlog(@RequestBody Blog blog) {
        Blog blog1= blogService.updateBlog(blog);
        return new ResponseEntity<>(blog1,HttpStatus.OK);

    }
}
