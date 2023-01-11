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

    AccountRepository repository;

    @Override
    public List<Account> getAll() throws Exception {
        return null;
    }

    @Override
    public Account get() throws Exception {
        return null;
    }

    @Override
    public Account update() throws Exception {
        return null;
    }

    @Override
    public Account join(Account account) throws Exception {
        return repository.save(account);
    }

    @Override
    public Account delete() throws Exception {
        return null;
    }
}
