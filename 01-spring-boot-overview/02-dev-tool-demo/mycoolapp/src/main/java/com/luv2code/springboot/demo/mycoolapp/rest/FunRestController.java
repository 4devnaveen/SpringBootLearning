package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


   //expose "workout"
    @GetMapping("/workout")
    public String Gethello()
    {
        return "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
    }
    //expose simply return "myapp"
    @GetMapping("/myapp/workout")
    public int numer()
    {
        int i = 45;
        return i;
    }

}
