package com.example.githubactionapp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionApp1Application {
    @GetMapping("/")
    public String get() {
        return "Welcome to the masquerade!!!";
    }
    public static void main(String[] args) {
        SpringApplication.run(GithubActionApp1Application.class, args);
    }

}
