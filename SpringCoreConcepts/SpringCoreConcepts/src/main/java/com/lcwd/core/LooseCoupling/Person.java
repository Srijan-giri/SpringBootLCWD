package com.lcwd.core.LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.lcwd.core.TightCoupling.Animal;

@Component("person")
public class Person {

	@Autowired
	@Qualifier(value = "dog")
    Animal1 animal;
	

//  //  COnstructor Injection	

//    @Autowired
//    public Person(@Qualifier(value = "dog") Animal1 animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal(){
        // Using Animal
        animal.play();

    }



}
