package com.example.hello_springboot;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private final GreetingService greetingService;

    //コンストラクタインジェクション
    public HelloController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    //POSTリクエストの受け付け
    @PostMapping("/hello")
    public Greeting createGreeting(@RequestBody GreetingRequest request){
        return greetingService.createGreeting(request.getName(),request.getLanguage());
    }
}