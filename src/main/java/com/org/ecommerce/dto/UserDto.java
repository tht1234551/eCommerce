package com.org.ecommerce.dto;

import com.org.ecommerce.repository.UserRepository;
import com.org.ecommerce.service.UserService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserDto {

    public static class Response {

    }

    public static class Request {

    }

    final UserService service;
}
