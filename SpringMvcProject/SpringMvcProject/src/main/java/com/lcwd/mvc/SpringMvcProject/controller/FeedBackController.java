package com.lcwd.mvc.SpringMvcProject.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class FeedBackController {

//    @RequestMapping(value="/feedbacks" ,method = RequestMethod.GET)
    @GetMapping(value = "/feedbacks")
    public List<String> getFeedbacks(){
        List<String> feedbackList = Arrays.asList(
                "Good Course",
                "nice one",
                "valuable thing"
        );

        return feedbackList;
    }

    @PostMapping(value = "/create-feedback")
    public String createFeedback(){
        System.out.println("Feedback Created");
        return "created feedback";
    }


    /*
      @PutMapping(value = "/")
      @DeleteMapping(value = "/")
      @PatchMapping(value = "/")
     */

//    @PutMapping
//    @PatchMapping
//    @DeleteMapping

}
