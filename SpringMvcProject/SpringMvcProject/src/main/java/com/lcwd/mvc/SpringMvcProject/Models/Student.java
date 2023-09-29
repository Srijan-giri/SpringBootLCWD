package com.lcwd.mvc.SpringMvcProject.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

//@Getter
//@Setter
//@ToString

public class Student {
    private String name;
    private int empId;
    private String phone;
    @JsonIgnore
    private String dept;
    private List<String> laptops;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//   @JsonIgnore
    @JsonProperty
    public String getDept() {
        return dept;
    }


//    @JsonProperty
    @JsonIgnore
    public void setDept(String dept) {
        this.dept = dept;
    }

    public List<String> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<String> laptops) {
        this.laptops = laptops;
    }
}
