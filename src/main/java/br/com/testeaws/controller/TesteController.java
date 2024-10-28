package br.com.testeaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/teste/hello")
    public String hello() {
        return "Hello World!";
    }
}
