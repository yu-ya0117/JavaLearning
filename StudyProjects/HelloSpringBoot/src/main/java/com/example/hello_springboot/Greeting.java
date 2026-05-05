package com.example.hello_springboot;

public class Greeting {
    private String message;
    private String language;

    public Greeting(String message,String language) {
        this.message = message;
        this.language = language;
    }

    //以下出力用getter
    public String getMessage() {
        return message;
    }

    public String getLanguage() {
        return language;
    }
}