package com.lcwd.core.DependencyInjection;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog_DI implements Animal2 {
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