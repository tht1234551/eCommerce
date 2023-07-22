//package com.org.ecommerce.service.impl;
//
//import com.org.ecommerce.domain.User;
//import com.org.ecommerce.service.UserService;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.annotation.Rollback;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@Transactional
//@Rollback
//class UserServiceImplTest {
//
//    @MockBean
//    UserService service;
//
//    @Test
//    @DisplayName("context load")
//    public void contextLoads() {
//        assertThat(service).isNotNull();
//    }
//
//    @Test
//    void getAll() {
//        List<User> accounts = service.readAll();
//        assertThat(accounts).isNotNull();
//        assertThat(accounts).isNotEmpty();
//    }
//
//    @Test
//    void get() {
//        String email = "test@naver.com";
//        User account = User
//                .builder()
//                .email(email)
//                .build();
//        service.insert(account);
//
//        assertThat(service.read(email)).isNotNull();
//    }
//
//    @Test
//    void update() {
//        String email = "test@naver.com";
//
//        User insertTemp = User
//                .builder()
//                .email(email)
//                .build();
//        User insertResult = service.insert(insertTemp);
//
//        User updateTemp = User
//                .builder()
//                .no(insertResult.getNo())
//                .email(insertResult.getEmail())
//                .name("john doe")
//                .build();
//        service.update(updateTemp);
//
//        User selectResult = service.read(email);
//        assertThat(selectResult.getName()).isEqualTo("john doe");
//    }
//
//    @Test
//    void join() {
//        String email = "test@naver.com";
//        User account = User
//                .builder()
//                .email(email)
//                .build();
//
//        service.insert(account);
//        User selectResult = service.read(email);
//
//        assertThat(selectResult).isNotNull();
//    }
//
//    @Test
//    void deleteByEmail() {
//        String email = "test@naver.com";
//        User account = User
//                .builder()
//                .email(email)
//                .build();
//
//        service.insert(account);
//
//        service.delete(email);
//
//        User selectResult = service.read(email);
//
//    }
//}