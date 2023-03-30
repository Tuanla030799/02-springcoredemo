package com.tuna.springcoredemo.rest;

import com.tuna.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

//    <!-- Constructor Injection -->
//    @Autowired
//    public DemoController(Coach theCoach) {
//        this.myCoach = theCoach;
//    }t

//    <!-- Constructor Injection -->
    @Autowired
    public void setCoach(@Qualifier("aquatic") Coach theCoach) {
        System.out.println("In Constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
    }
    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

}
