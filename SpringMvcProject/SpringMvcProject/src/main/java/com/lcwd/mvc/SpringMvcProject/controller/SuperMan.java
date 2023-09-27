package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SuperMan {


    /*
       /about
       @RequestMapping is used for mapping the url with controller method
     */
    @RequestMapping(path="/about",method = RequestMethod.GET)
    public String aboutRequestHandler(){
        System.out.println("processing About Request");
        return "About";
    }
    @RequestMapping(path="/services",method = RequestMethod.GET)
    public String serviceRequestHandler(){
        System.out.println("processing service Request");
        return "Services";
    }
}
