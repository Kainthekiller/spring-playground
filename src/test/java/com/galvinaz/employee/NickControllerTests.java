package com.galvinaz.employee;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;



import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(NickClass.class)
public class NickControllerTests {

    @Autowired
    MockMvc mvc;

    @Test
    public void returnPi() throws Exception {
        RequestBuilder request = get("/Nick/pi");

        this.mvc.perform(get("/Nick/pi"))
                .andExpect(status().isOk())
                .andExpect(content().string("3.14"));


    }

}
