package com.lcwd.mvc.SpringMvcProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Student {
    private String name;
    private int empId;
    private String phone;
//    @JsonIgnore
    private String dept;
    private List<String> laptops;


}
