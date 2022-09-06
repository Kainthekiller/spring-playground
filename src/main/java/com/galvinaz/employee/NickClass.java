package com.galvinaz.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Nick")
public class NickClass {


    @GetMapping("/pi")
    public String getPi()
    {
        return "3.14";
    }





}
