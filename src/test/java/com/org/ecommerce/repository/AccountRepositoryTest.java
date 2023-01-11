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
    public void insert() {
        Account account = Account.builder().email("test@naver.com").build();

        assertThat(repository.save(account)).isNotNull();
    }
}