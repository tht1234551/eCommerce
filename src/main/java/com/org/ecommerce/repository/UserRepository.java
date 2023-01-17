package com.org.ecommerce.repository;

import com.org.ecommerce.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, java.lang.Long> {

    @NonNull
    @Override
    List<User> findAll();

    User findByEmail(String email);

    @NonNull
    @Override
    <S extends User> S save(@NonNull S entity);

    Long deleteByEmail(String email);

}
