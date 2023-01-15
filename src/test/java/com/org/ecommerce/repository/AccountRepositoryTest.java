package com.org.ecommerce.repository;

import com.org.ecommerce.domain.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
//@AutoConfigureMockMvc
//@Transactional
//@Rollback
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class AccountRepositoryTest {

    @Autowired
    AccountRepository repository;

    @Test
    public void contextLoads() {
        assertThat(repository).isNotNull();
    }

    @Test
    public void readAllTest() {
        Stream.of("test@naver.com", "test2@naver.com").forEach(email -> {
            Account temp = Account.builder().email(email).build();
            repository.save(temp);
        });

        assertThat(repository.findAll()).isNotEmpty();
    }

    @Test
    public void readTest() {
        Account temp = Account.builder().email("test@naver.com").build();
        Account account = repository.save(temp);

        assertThat(repository.findByEmail(account.getEmail())).isNotNull();
    }

    @Test
    public void createTest() {
        Account account = Account.builder().email("test@naver.com").build();

        assertThat(repository.save(account)).isNotNull();
    }

    @Test
    public void updateTest() {
        Account insertTemp = Account.builder().email("test@naver.com").build();
        Account insertResult = repository.save(insertTemp);

        Account updateTemp = Account.builder()
                .no(insertResult.getNo())
                .email(insertResult.getEmail())
                .phone("010-1123-1343")
                .build();
        Account updateResult = repository.save(updateTemp);

        assertThat(updateResult).isNotNull();
        assertThat(updateResult.getPhone()).isEqualTo("010-1123-1343");
    }

    @Test
    public void deleteTest() {
        Account insertTemp = Account.builder().email("test@naver.com").build();
        Account insertResult = repository.save(insertTemp);

        Account deleteResult = repository.deleteByEmail(insertResult.getEmail()).get(0);
        assertThat(deleteResult).isNotNull();
    }

}