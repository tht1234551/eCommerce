package com.org.ecommerce.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@AutoConfigureMockMvc
@WebMvcTest(UserController.class)
class UserControllerTests {

    @Autowired
    private UserController controller;

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
//        Account account = Account.builder()
//                .name("jjj")
//                .age("123")
//                .build();
//        assertThat(controller.joinAccount(account)).isNotNull();
    }

}
