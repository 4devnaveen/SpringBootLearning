package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

   @Value("${server.port}")
   private String s;

    @GetMapping("/")
    public int sayHello()
    {
        return "7t7"
    }

}
