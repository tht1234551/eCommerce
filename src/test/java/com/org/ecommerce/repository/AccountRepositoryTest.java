package com.org.ecommerce.repository;

import com.org.ecommerce.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class AccountRepositoryTest {
    @Autowired
    AccountRepository repository;

    @Test
    public void contextLoads() throws Exception {
        assertThat(repository).isNotNull();
    }

    @Test
    public void readAllTest() {
        assertThat(repository.findAll()).isNotEmpty();
    }

    @Test
    public void readTest() {
        assertThat(repository.findByEmail("test@naver.com")).isNotNull();
    }

    @Test
    public void createTest() {
        int ran = (int) (Math.random() * 999999);
        Account account = Account.builder().email("test" + ran + "@naver.com").build();

        assertThat(repository.save(account)).isNotNull();
    }

    @Test
    public void updateTest() {
        Account account = Account.builder()
                .no(4L)
                .email("test@naver.com")
                .build();
        assertThat(repository.save(account)).isNotNull();
    }

}