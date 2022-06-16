package com.example.voila.controllers;

import com.example.voila.entities.Category;
import com.example.voila.reposotories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;
    @GetMapping("/add")
    public String add(){
        return "CreateCategory";
    }
    @PostMapping( "/add_category")
    public ModelAndView add_category(@RequestParam(value = "title") String title) {
        System.out.println(title);
        Category category = new Category(title);
        categoryRepository.save(category);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("CreateCategory");
     return mv;
    }



}
