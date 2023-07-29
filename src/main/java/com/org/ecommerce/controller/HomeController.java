package com.org.ecommerce.controller;

import com.org.ecommerce.util.ContextUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
@Slf4j
@AllArgsConstructor
public class HomeController {
    @SuppressWarnings("SpringMVCViewInspection")
    @ResponseBody
    public String home(String[] cars) {
        return "test";
    }
}
