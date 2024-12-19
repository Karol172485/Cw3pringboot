package com.example.cw3pringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Cw3pringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Cw3pringbootApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "mojeImie", defaultValue = "World") String name) {
        return String.format("Czesc %s!", name);
    }

}