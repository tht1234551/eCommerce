package com.org.ecommerce.controller;

import com.org.ecommerce.domain.User;
import com.org.ecommerce.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RepositoryRestController
//@RequestMapping("/users")
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping
    public List<User> getAccounts() {
        return service.readAll();
    }

//    @GetMapping
//    public List<User> getAccounts() {
//        return service.readAll();
//    }
//
//    @GetMapping(path="/{email}")
//    public User getAccount(@PathVariable String email) {
//        log.info(email);
//        return service.read(email);
//    }
//
//    @PostMapping
//    public User joinAccount(User user) {
//        return service.insert(user);
//    }
//
//    @PatchMapping
//    public User updateAccount(User user) {
//        return service.update(user);
//    }
//
//    @DeleteMapping
//    public Long deleteAccount(String email) {
//        return service.delete(email);
//    }
}
