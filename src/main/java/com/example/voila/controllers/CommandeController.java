package com.example.voila.controllers;

import com.example.voila.entities.Product;
import com.example.voila.entities.User;
import com.example.voila.reposotories.CategoryRepository;
import com.example.voila.reposotories.ProductRepository;
import com.example.voila.reposotories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

 /*   @Autowired
    CommandeRepository commandeRepository;

    @Autowired
    UserRepository userRepository;
    @GetMapping("/add")
    public ModelAndView add(){

        List<Product> products=new ArrayList<Product>();
        products=productRepository.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("products",products);
        mv.setViewName("addcommande");
        return mv;
    }
    @PostMapping( "/add_commande")
    public ModelAndView add_commande(@RequestParam(value = "count") int count, @RequestParam(value = "product") Long product) {

        Product pro = productRepository.getById(product);
        List<Product> products=new ArrayList<Product>();
        products.add(pro);
        User user = userRepository.getOne(1L);
       Commande com=new Commande();
       com.setProducts(products);
       com.setCount(count);
       commandeRepository.save(com);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("addcommande");
        return mv;
    }*/
}
