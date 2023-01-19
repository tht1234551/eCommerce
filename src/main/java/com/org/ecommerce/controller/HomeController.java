package com.org.ecommerce.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping
@Slf4j
@AllArgsConstructor
public class HomeController {

    @SuppressWarnings("SpringMVCViewInspection")
    @GetMapping("/")
    public String home() {
        return "index.html";
    }

}
