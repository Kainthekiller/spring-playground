package com.galvinaz.employee;




import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(PagesController.class)
public class PageControllerTest {
    @Autowired
    private MockMvc mvc;


    @Test
    public void sayHello() throws Exception {
        RequestBuilder requestsss = MockMvcRequestBuilders.get("/hello");

        this.mvc.perform(requestsss)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World"));
    }


}
