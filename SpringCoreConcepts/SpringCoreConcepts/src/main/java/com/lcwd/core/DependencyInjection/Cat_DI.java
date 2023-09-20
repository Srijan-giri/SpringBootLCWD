package com.lcwd.core.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Cat_DI implements Animal2{
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
