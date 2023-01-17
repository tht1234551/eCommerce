package com.org.ecommerce.service;


import com.org.ecommerce.domain.User;

import java.util.List;

public interface UserService {

    List<User> readAll();

    User read(String email);

    User update(User user);

    User insert(User user);

    Long delete(String email);

}
