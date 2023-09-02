package br.senai.lab365.Aula1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("hello")
public class HelloContoller {
    @GetMapping
    public String hello() {
        return "hello";
    }
}
