package me.ssagan.dimpledockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDocker {
    @GetMapping("/")
    public String hello() {
        return "Hello Docker!";
    }
}
