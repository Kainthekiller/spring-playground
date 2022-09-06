package com.galvinaz.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello World";
    }

    @PostMapping("/hello")
    public String helloPost()
    {
        return "Hello World Post";
    }

}
