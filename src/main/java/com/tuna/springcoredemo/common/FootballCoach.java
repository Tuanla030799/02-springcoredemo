package com.tuna.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FootballCoach implements Coach{

    public FootballCoach() {
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

//    // define out init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff() : " + getClass().getSimpleName());
//    }
//    // define out destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff() : " + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "Send 60 minutes in running practice !";
    }
}
