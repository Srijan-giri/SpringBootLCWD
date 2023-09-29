package com.lcwd.mvc.SpringMvcProject.controller;

import com.lcwd.mvc.SpringMvcProject.Models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

       json ----> java object convert ==> deserialization

       java object ---> json ===> serialization

       response ::

       {
         "name": "Asim"
       }
     */

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public ResponseEntity<Student> createStudent(@RequestBody List<Student> students) {
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

        // save data
        // logic apply
        System.out.println(students);
        System.out.println("Student size : "+students.size());

        // save student data


        // List
       List<String> food = Arrays.asList("pizza","burger");

       // Map

//        Map<String,Object> data = new HashMap<>();
//        data.put("content",students);
//        data.put("food",food);
//        data.put("error","No Error found");
//        data.put("Current Date",new Date());
//        data.put("systemInformation",System.getProperties());

//           String str = null;
//           System.out.println(str.length());


          Student student = students.get(0);
          student.setDept("Test");


          //Consume : json include : setter : @JsonProperty
          // Produce : json exclude : getter : @JsonIgnore


//        ResponseEntity<Student> response = new ResponseEntity<>(student, HttpStatus.OK);
        ResponseEntity<Student> response = ResponseEntity.status(HttpStatus.OK).body(student);




       // return students;
        // return students.get(0);
//        return student;
        return response;

    }
}
