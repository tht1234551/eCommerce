package com.org.ecommerce.repository;

import com.org.ecommerce.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    List<Account> findAll();
    Account findByEmail(String email);
    Account save(Account account);
}
