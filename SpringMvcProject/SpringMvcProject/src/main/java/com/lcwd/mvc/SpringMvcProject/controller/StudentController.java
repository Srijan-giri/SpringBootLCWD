package com.lcwd.mvc.SpringMvcProject.controller;

import com.lcwd.mvc.SpringMvcProject.Models.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    // create student
    /*
       data  required
       request :::
       {
          "name": "Asim"
       }

       we have receiving data in json format

       json ----> java convert ==> deserialization
     */

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String createStudent(@RequestBody List<Student> students) {
        //    public void createStudent(@RequestBody Map<String,Object> data) {

        // we have to create student

        /*
        System.out.println(data);
        Object name = data.get("name");
        Object empId = data.get("emp_id");
        Object phone = data.get("phone");
        Object department = data.get("department");
        List<Object> laptops = Arrays.asList(data.get("laptops"));

        System.out.println("Name :"+name);
        System.out.println("Employee Id :" + empId);
        System.out.println("Phone :"+phone);
        System.out.println("Department : " + department);
        System.out.println("Laptops  :"+laptops);
         */


        System.out.println(students);
        System.out.println("Student size : "+students.size());

        // save student data



       return "Created";
    }
}
