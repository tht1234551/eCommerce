package com.org.ecommerce.service;


import com.org.ecommerce.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAll();

    Account get(String email);

    Account update(Account account);

    Account join(Account account);

    Account deleteByEmail(String email);

}
