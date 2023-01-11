package com.org.ecommerce.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
class AccountControllerTests {

    @Autowired
    private AccountController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void mockMvcLoads() throws Exception {
        assertThat(mockMvc).isNotNull();
    }

    @Test
    public void join() throws Exception {
        assertThat(controller.getAccounts1()).isNotNull();
    }

}
