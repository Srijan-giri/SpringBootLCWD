package com.lcwd.first.controllers;

import com.lcwd.first.Model.TodoManager;
import com.lcwd.first.config.LCWDConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@RestController
public class HomeController {

    @Value("${lcwd.profile.image.path}")
    private String profilePath; // by default null
    @Value("${lcwd.profile.image.dir}")
    private String profileDirectory;

    @Autowired
    private LCWDConfig lcwdConfig;


    @RequestMapping(path = "/todos")
    public List<String> justTest()
    {
        // automatic json configure
        List<String> todos = Arrays.asList(
                "learn java",
                "Learn Spring Boot",
                "Develop Project",
                "Develop Project",
                "Learn Django",
                "Learn Nodejs",
                "Learn Spring Boot",
                "learn PHP"
        );
        return todos;
    }

    @RequestMapping("/course")
    public HashMap<String,String> courseDuration(){
        HashMap<String,String> course = new HashMap<>();
        course.put("Spring Boot","2.5 months");
        course.put("Django","2.5 months");
        course.put("Node JS","1 months");
        course.put("PHP & Laravel","2.5 months");

        return course;

    }

    @RequestMapping("/profile-path")
    public String getProfilePath(){
        return this.profilePath;
    }

    @RequestMapping("/profile-dir")
    public String getProfileDirectory(){
        return this.profileDirectory;
    }

    @RequestMapping("/lcwdconfig")
    public LCWDConfig getLcwdConfig(){
        System.out.println(this.lcwdConfig);
        return this.lcwdConfig;
    }

    @RequestMapping("/allTodos")
    public List<TodoManager> getAllTodos(){
        List<TodoManager> allTodos = Arrays.asList(
                new TodoManager(1,"Spring Boot"),
                new TodoManager(2,"Django"),
                new TodoManager(3,"Node JS")
        );

        System.out.println(allTodos);
        return allTodos;
    }
}
