package com.org.ecommerce.service.Impl;

import com.org.ecommerce.domain.Account;
import com.org.ecommerce.service.AccountService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@Rollback
class AccountServiceImplTest {

    @MockBean
    AccountService service;

    @Test
    @DisplayName("context load")
    public void contextLoads() {
        assertThat(service).isNotNull();
    }

    @Test
    void getAll() {
        List<Account> accounts = service.getAll();
        assertThat(accounts).isNotNull();
        assertThat(accounts).isNotEmpty();
    }

    @Test
    void get() {
        String email = "test@naver.com";
        Account account = Account
                .builder()
                .email(email)
                .build();
        service.join(account);

        assertThat(service.get(email)).isNotNull();
    }

    @Test
    void update() {
        String email = "test@naver.com";

        Account insertTemp = Account
                .builder()
                .email(email)
                .build();
        Account insertResult = service.join(insertTemp);

        Account updateTemp = Account
                .builder()
                .no(insertResult.getNo())
                .email(insertResult.getEmail())
                .name("john doe")
                .build();
        service.update(updateTemp);

        Account selectResult = service.get(email);
        assertThat(selectResult.getName()).isEqualTo("john doe");
    }

    @Test
    void join() {
        String email = "test@naver.com";
        Account account = Account
                .builder()
                .email(email)
                .build();

        service.join(account);
        Account selectResult = service.get(email);

        assertThat(selectResult).isNotNull();
    }

    @Test
    void deleteByEmail() {
        String email = "test@naver.com";
        Account account = Account
                .builder()
                .email(email)
                .build();

        service.join(account);

        service.deleteByEmail(email);

        Account selectResult = service.get(email);

    }
}