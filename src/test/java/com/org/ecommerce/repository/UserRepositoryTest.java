package com.org.ecommerce.repository;

import com.org.ecommerce.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

//@SpringBootTest
//@AutoConfigureMockMvc
//@Transactional
//@Rollback
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;

    @Test
    public void contextLoads() {
        assertThat(repository).isNotNull();
    }

    @Test
    public void readAllTest() {
        Stream.of("test@naver.com", "test2@naver.com").forEach(email -> {
            User temp = User.builder().email(email).build();
            repository.save(temp);
        });

        assertThat(repository.findAll()).isNotEmpty();
    }

    @Test
    public void readTest() {
        User temp = User.builder().email("test@naver.com").build();
        User User = repository.save(temp);

        assertThat(repository.findByEmail(User.getEmail())).isNotNull();
    }

    @Test
    public void createTest() {
        User user = User.builder()
                .email("test@naver.com")
                .build();

        assertThat(repository.save(user)).isNotNull();
    }

    @Test
    public void updateTest() {
        User insertTemp = User.builder().email("test@naver.com").build();
        User insertResult = repository.save(insertTemp);

        User updateTemp = User.builder()
                .no(insertResult.getNo())
                .email(insertResult.getEmail())
                .phone("010-1123-1343")
                .build();
        User updateResult = repository.save(updateTemp);

        assertThat(updateResult).isNotNull();
        assertThat(updateResult.getPhone()).isEqualTo("010-1123-1343");
    }

    @Test
    public void deleteTest() {
        User insertTemp = User.builder().email("test@naver.com").build();
        User insertResult = repository.save(insertTemp);

        Long deleteRow = repository.deleteByEmail(insertResult.getEmail());
        assertThat(deleteRow).isGreaterThan(0);
    }

}