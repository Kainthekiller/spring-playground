package com.galvinaz.employee.Cats;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class CatsControllerTest {


    @Autowired
    MockMvc mvc;

    @Test
    void getCatsReturnNameOfCats() throws Exception {
        //Test 1
        this.mvc.perform(get("/cats?name=fluffy&color=tabby"))
                .andExpect(status().isOk())
                .andExpect(content().string("The name of the cat is fluffy and it is a tabby"));


        //Test 2
        this.mvc.perform(get("/cats?name=midnight&color=black"))
                .andExpect(status().isOk())
                .andExpect(content().string("The name of the cat is midnight and it is a black"));

    }
}
