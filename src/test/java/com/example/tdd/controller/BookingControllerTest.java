package com.example.tdd.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

//@SpringBootTest
// @AutoConfigureMockMvc
@WebMvcTest(controllers = BookingController.class)
public class BookingControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void bookingTestGetAll() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/bookings"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
