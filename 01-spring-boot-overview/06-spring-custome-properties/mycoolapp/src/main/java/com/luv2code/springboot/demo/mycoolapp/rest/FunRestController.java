package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


    @Value("${coach.name}")
    private String coachName;
    @Value("${coach.team}")
    private  String teamName;

    @GetMapping("/")
    public int sayHello()
    {
        return 9;
    }

    //expose will return  coach name anscoach team "coachDetails"
    @GetMapping("/coachDetails")
    public String getCoachDetails()
    {
        return "coach Name:"+coachName + " "+ "coach Team:"+teamName;
    }

}
