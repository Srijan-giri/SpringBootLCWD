package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Controller
@RestController // combination of @Controller + @ResponseBody
@RequestMapping("/api")
public class ApiController {

    @RequestMapping( value = "/hello" , method = RequestMethod.GET)
//    @ResponseBody
    public String HelloApi(){
        return "Hello , how are you, whats going these days"; // response as a text
    }


    @RequestMapping(value="/users",method = RequestMethod.GET)
//    @ResponseBody
    public List<String> getUserData(){
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("Ram");
//        list.add("Shyam");
//        list.add("Chiku");
//        return Arrays.asList(list).toString();
        return Arrays.asList("Ram", "Shyam","Chiku");
    }


    @RequestMapping(value="/create-user", method=RequestMethod.POST)
     public String createUser(){
         System.out.println("Create User");
         return "user created !!";
     }


}
