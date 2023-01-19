package com.org.ecommerce.controller;

import com.org.ecommerce.domain.User;
import com.org.ecommerce.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
@Slf4j
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping(path="/")
    public List<User> getAccounts() {
        return service.readAll();
    }

    @GetMapping(path="/{email}")
    public User getAccount(@PathVariable String email) {
        log.info(email);
        return service.read(email);
    }

    @PostMapping(path="/")
    public User joinAccount(User user) {
        return service.insert(user);
    }

    @PatchMapping(path="/")
    public User updateAccount(User user) {
        return service.update(user);
    }

    @DeleteMapping(path="/")
    public Long deleteAccount(String email) {
        return service.delete(email);
    }
}
