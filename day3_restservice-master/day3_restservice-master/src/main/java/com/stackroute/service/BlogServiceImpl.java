package com.stackroute.service;

import com.stackroute.domain.Blog;

import com.stackroute.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Service indicates annotated class is a service which hold business logic in the Service layer
 */
@Service
public class BlogServiceImpl implements BlogService {
    private BlogRepository blogRepository;

    /**
     * Constructor based Dependency injection to inject BlogRepository here
     */
    @Autowired
    public BlogServiceImpl(BlogRepository blogRepository) {

        this.blogRepository = blogRepository;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlogs() {
        return (List<Blog>) blogRepository.findAll();
    }

    @Override
    public Blog getBlogById(int id) {
        Optional<Blog> check=blogRepository.findById(id);
        return check.orElseThrow(null);
    }

    @Override
    public Blog deleteBlog(int id) {
        Optional<Blog> check=blogRepository.findById(id);
        if(check.isPresent()){
            Blog bb=check.get();
            blogRepository.deleteById(bb.getBlogId());
            return bb;
        }
        return null;

    }

    @Override
    public Blog updateBlog(Blog blog) {
       Optional<Blog> existing= blogRepository.findById(blog.getBlogId());
        if(existing.isPresent()){
            Blog bb=existing.get();
            bb.setBlogContent(blog.getBlogContent());
            bb.setBlogId(blog.getBlogId());
            bb.setBlogTitle(blog.getBlogTitle());
            bb.setAuthorName(blog.getAuthorName());
        blogRepository.save(bb);
            return blog;
    }
      return null;

    }

    /**
     * save a new blog
     */

    /**
     * retrieve all blogs
     */


    /**
     * retrieve blog by id
     */

    /**
     * delete blog by id
     */

    /**
     * update blog
     */
}

