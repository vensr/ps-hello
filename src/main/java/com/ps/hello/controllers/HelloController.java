package com.ps.hello.controllers;

import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public ResponseEntity<Object> hello() {
        return ResponseEntity.status(HttpStatus.OK).body(
                Collections.singletonMap("greetings", "hello"));
    }

}
