package com.remembrall.remembrall.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class Hello {
    @GetMapping
    public String hello() {
        return "Hello world";
    }
}
