package com.example.demo;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/ping")
    public String ping() {
        return "ping";
    }

    @RequestMapping("greet")
    public String getName(@RequestParam(value = "name", defaultValue = "User") String personName) {
        return "Welcome " + personName;
    }
}

