package com.galvinaz.employee;


import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/math")
public class pi {

       @GetMapping("/pi")
        public String pi()
        {
            return "3.141592653589793";
        }

        @GetMapping("/gravity")
    public String gravity() {return "-9.81";}

    @GetMapping("/tasks")
    public String tasks() {return "This is a task";}

    @GetMapping("/Search")
    public String getCats(@RequestParam(required = false, value = "q")String query)
    {
        return query + " Search was " + query;
    }

    @GetMapping("/Product/{id}")
    public  int getProduct(@PathVariable int id)
    {
        return id;
    }


    @GetMapping("/calculate")
    public int calculate(@RequestParam String operations,@RequestParam int a, @RequestParam int b)
    {
        if (Objects.equals(operations, "multiple"))
        {
            return a * b;
        }
        if (Objects.equals(operations, "subtract"))
        {
            return a - b;
        }
        if (Objects.equals(operations, "add"))
        {
            return a + b;
        }
        else {
            return 40440404;
        }
    }

    @RequestMapping("/volume/{a}/{b}/{c}")
    public int Volume(@PathVariable int a, @PathVariable int b, @PathVariable int c)
    {
        return a * b * c;
    }




}
