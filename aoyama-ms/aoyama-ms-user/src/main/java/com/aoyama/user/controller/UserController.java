package com.aoyama.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserController {

    @GetMapping("/getStr")
    public Mono<String> getStr(){
        return Mono.just("1");
    }
}
