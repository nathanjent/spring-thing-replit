package com.replit.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {
  @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}
