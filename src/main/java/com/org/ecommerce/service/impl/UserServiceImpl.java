package com.org.ecommerce.service.impl;

import com.org.ecommerce.domain.User;
import com.org.ecommerce.repository.UserRepository;
import com.org.ecommerce.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private UserRepository repository;

    @Override
    public List<User> readAll() {
        return repository.findAll();
    }

    @Override
    public User read(String email) {
        return repository.
                findByEmail(email);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public User insert(User user) {
        return repository.save(user);
    }

    @Override
    public Long delete(String email) {
        return repository.deleteByEmail(email);
    }
}
