package com.rare.veel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UIController {

    @GetMapping("/temp")
    public String getFirstPage(Model model){

        return "index";
    }

    @GetMapping("/nextPage")
    public String getSecondPage(Model model){
        return "metadata";
    }
}
