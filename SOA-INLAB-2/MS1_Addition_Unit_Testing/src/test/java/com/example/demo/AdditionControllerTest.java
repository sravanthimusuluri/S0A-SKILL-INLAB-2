package com.example.demo;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(AdditionController.class)
class AdditionControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private AdditionService service;

    @Test
    void testAdditionWithNegativeNumbers() throws Exception {
        when(service.add(-5, 5)).thenReturn(0);

        mockMvc.perform(get("/ms1/add")
                .param("a", "-5")
                .param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("MS 1.1 - Additon = 0"));
    }
}
