package com.galvinaz.employee;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(pi.class)
public class piTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void piAsAString() throws Exception
    {
        RequestBuilder request = MockMvcRequestBuilders.get("/math/gravity");
        RequestBuilder request2 = MockMvcRequestBuilders.get("/math/Search");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("-9.81"));

        this.mvc.perform(request2)
                .andExpect(status().isOk());
               // .andExpect(content().string("This is a task"));
    }



}
