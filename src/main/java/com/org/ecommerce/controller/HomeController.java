package com.org.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping("/test")
    public Map<String, String> home() {
        Map<String, String> map = new HashMap<>();
        map.put("test", "23432432");
        return map;
    }
}
