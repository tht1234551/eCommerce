package com.org.ecommerce.controller;

import com.org.ecommerce.domain.Account;
import com.org.ecommerce.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/account")
@Slf4j
@AllArgsConstructor
public class AccountController {

    private AccountService service;

    @GetMapping(path="/")
    public Account getAccount() {
        return null;
    }

    @GetMapping(path="/{id}")
    public Account getAccount(@PathVariable String id) {
        return null;
    }

    @PostMapping(path="/")
    public Account getAccounts1() throws Exception {
        Account account = Account
                .builder()
                .email("testUsers")
                .password("asdsadas")
                .build();

        return service.join(account);
    }

    @PutMapping(path="/")
    public Account getAccounts2() {
        return null;
    }

    @DeleteMapping(path="/")
    public Account getAccounts3() {
        return null;
    }
}
