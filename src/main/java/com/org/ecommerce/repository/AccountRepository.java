package com.org.ecommerce.repository;

import com.org.ecommerce.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    @Override
    @NonNull
    List<Account> findAll();

    Account findByEmail(@NonNull String email);

    @Override
    @NonNull
    <S extends Account> S save(@NonNull S entity);

    List<Account> deleteByEmail(@NonNull String email);
}
