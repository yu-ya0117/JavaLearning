package com.example.hello_springboot;

import org.springframework.stereotype.Service;

@Service
public class GreetingService{
    public Greeting createGreeting(String name, String language){
        String message;

        if(language.equalsIgnoreCase("Japanese")){
            message = "こんにちは、" + name + "さん！";
        } else {
            message = "Hello," + name + "!";
        }
        return new Greeting(message,language);
    }
}