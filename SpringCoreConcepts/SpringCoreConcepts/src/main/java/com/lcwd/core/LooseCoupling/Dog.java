package com.lcwd.core.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dog")
//@Primary
public class Dog implements Animal1 {
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

/*
 * 
 * @Component("dog")
 *  is equal to
 *  @Component
 *  @Qualifier("dog")
*/