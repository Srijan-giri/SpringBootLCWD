package com.lcwd.core.TightCoupling;

public class Person {

    // hardcore animal object creating
    // person is tightly coupled with animal
    // So , When we create Person object , automatically animal object
    // will be created---> that is done by loose coupling

    Animal animal = new Animal();
    public void playWithAnimal(){
        // Using Animal
        animal.play();

    }



}
