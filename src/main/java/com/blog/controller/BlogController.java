/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author TECNO-BASE
 */
@Controller
public class BlogController {

    @GetMapping("/")
    public ModelAndView carregarBlog() {
        return new ModelAndView("blog/index");
    }
}
