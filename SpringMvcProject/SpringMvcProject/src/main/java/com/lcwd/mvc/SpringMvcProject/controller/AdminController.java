package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping("/login")
  public String loginPageHandler(){
      return "login";
  }
}
