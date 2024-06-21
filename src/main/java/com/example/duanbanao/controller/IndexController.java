package com.example.duanbanao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("/")
 public String view(){
     return "view/banhang";
    }
}
