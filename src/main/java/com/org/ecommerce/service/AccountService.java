package com.org.ecommerce.service;


import com.org.ecommerce.domain.Account;

import java.util.List;

public interface AccountService {

    List<Account> getAll() throws Exception;

    Account get(String email) throws Exception;

    Account update() throws Exception;

    Account join(Account account) throws Exception;

    Account delete() throws Exception;

}
