package com.lcwd.core.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lcwd.core.TightCoupling.Animal;

@Component
public class Person_DI {

	// 3. Field Based Injection

	@Autowired
    Animal2 animal;
	
    @Autowired
    Student student;
    
    @Autowired
    @Qualifier(value="samosa2")
    Samosa samosa;
	
    
    
    // 1.constructor based injection : for mendatory
    
    /*
    @Autowired
    public Person_DI(Animal2 animal,Student student)
    {
    	System.out.println("calling constructor...autowiring");
    	this.animal =animal;
    	this.student=student;
    }
    */
    
    //2. setter based injection : for optional
    
    
   /*
	public Animal2 getAnimal() {
		return animal;
	}
	
	//  using autowired on setter : animal 


    //@Autowired
	public void setAnimal(Animal2 animal) {
    	System.out.println("setting animal");
		this.animal = animal;
	}



	public Student getStudent() {
		return student;
	}

	// using autowired on setter : student 

	//@Autowired
	public void setStudent(Student student) {
		System.out.println("setting student");
		this.student = student;
	}

    */
    


    public void playWithAnimal(){
  
        animal.play();
        student.detail();
        samosa.eat();

    }





}
