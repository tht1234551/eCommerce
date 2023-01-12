package com.org.ecommerce.controller;

import com.org.ecommerce.domain.Account;
import com.org.ecommerce.service.AccountService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/accounts")
@Slf4j
@AllArgsConstructor
public class AccountController {

    private AccountService service;

    @GetMapping(path="/")
    public List<Account> getAccounts() throws Exception {
        return service.getAll();
    }

    @GetMapping(path="/{email}")
    public Account getAccount(@PathVariable String email) throws Exception {
        log.info(email);
        return service.get(email);
    }

    @PostMapping(path="/")
    public Account joinAccount(Account account) throws Exception {
        return service.join(account);
    }

    @PutMapping(path="/")
    public Account updateAccount() {
        return null;
    }

    @DeleteMapping(path="/")
    public Account deleteAccount() {
        return null;
    }
}
