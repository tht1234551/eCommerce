package com.org.ecommerce.service.Impl;

import com.org.ecommerce.domain.Account;
import com.org.ecommerce.repository.AccountRepository;
import com.org.ecommerce.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {

    private AccountRepository repository;

    @Override
    public List<Account> getAll() {
        return repository.findAll();
    }

    @Override
    public Account get(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Account update(Account account) {
        return repository.save(account);
    }

    @Override
    public Account join(Account account) {
        return repository.save(account);
    }

    @Override
    public Account deleteByEmail(String email) {
        return repository.deleteByEmail(email).get(0);
    }
}
