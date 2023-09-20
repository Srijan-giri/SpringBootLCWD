package com.lcwd.core.LooseCoupling;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal1{
    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
