package com.example.voila.controllers;

import com.example.voila.entities.Category;
import com.example.voila.entities.Product;
import com.example.voila.reposotories.CategoryRepository;
import com.example.voila.reposotories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/register")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }
    @GetMapping("/edit_product/{id}")
    public ModelAndView edit_product(@PathVariable Long id){
        Product pro=productRepository.getOne(id);
        ModelAndView mv = new ModelAndView();
        List<Category> categories=new ArrayList<Category>();
        categories=categoryRepository.findAll();
        mv.addObject("categories",categories);
        mv.addObject("product",pro);
        mv.setViewName("editproduct");
        return mv;
    }
    @PostMapping ("/editproduct")
    public ModelAndView editproduct(@RequestParam(value = "name") String name,@RequestParam(value = "price") double price,
                                     @RequestParam(value = "category") Long category ,  @RequestParam(value = "id") Long id){
        Product pro=productRepository.getOne(id);
        pro.setName(name);
        pro.setPrice(price);
        Category myca=categoryRepository.getOne(category);
        pro.setCategory(myca);
        ModelAndView mv = new ModelAndView();
        List<Product> products=new ArrayList<Product>();
        products=productRepository.findAll();
        mv.addObject("products",products);
        mv.setViewName("list_product");
        return mv;
    }
    @GetMapping("/add")
    public ModelAndView add(){
        List<Category> categories=new ArrayList<Category>();
        categories=categoryRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("categories",categories);
        mv.setViewName("CreateProduct");
        return mv;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Long id){
        productRepository.deleteById(id);
        List<Product> products=new ArrayList<Product>();
        products=productRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("products",products);
        mv.setViewName("list_product");
        return mv;
    }
    @GetMapping("/list_product")
    public ModelAndView list_product(){
        List<Product> products=new ArrayList<Product>();
        products=productRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("products",products);
        mv.setViewName("list_product");
        return mv;
    }
    @PostMapping( "/add_product")
    public ModelAndView add_product(@RequestParam(value = "name") String name,@RequestParam(value = "price") double price,
                                    @RequestParam(value = "category") Long category) {
        Product product = new Product(name,price);
        Category myca=new Category();
        myca=categoryRepository.getOne(category);
        product.setCategory(myca);
        productRepository.save(product);
        ModelAndView mv = new ModelAndView();
        List<Product> products=new ArrayList<Product>();
        products=productRepository.findAll();
        mv.addObject("products",products);
        mv.setViewName("list_product");
        return mv;
    }
}
