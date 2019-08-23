package com.example.project_final.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller{
    @RequestMapping(value ={ "/thymeleafmerge/thymeleafBase"})
    public  void byPass(){}
}