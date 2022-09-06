package com.galvinaz.employee.Cats;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
//@RequestMapping("/Cats")
public class CatsController {

//<editor-fold desc="My variable holder">

    @GetMapping("/cats")
    public String getSpecificCats(@RequestParam(value = "name") String catName, @RequestParam(required = false, defaultValue = "test", value = "color") String colorParm )
    {
        http://www.google.com/cats?name=bob&color=Orange
    return String.format("The name of the cat is %s and it is a %s", catName , colorParm);
    }

    @GetMapping("/catss")
    public String getSpecific(@RequestParam Map<String, String> queryString)
    {


        return String.format(" %s The name of the cat is %s and it is a %s",queryString.get("test"), queryString.get("name") , queryString.get("color"));
    }

    @GetMapping("/CatClass")
    public String getSpecifics(Cat newCat)
    {


        return String.format("The name of the cat is %s and it is a %s",newCat.getNames(), newCat.getColor());
    }

    @GetMapping("/dogs/{dogId}/comments/{comment}")
   public String getDogById(@PathVariable String dogId, @PathVariable("comment") String commentId)
    {
        return  String.format("The Dog Id is: %s and the Comment Id is: %s", dogId, commentId);
    }
    //</editor-fold>



}
