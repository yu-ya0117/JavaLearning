package com.example.hello_springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//JSON形式として返すためのクラス
class Greeting {
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

@RestController
public class HelloController {

    //「/hello/(自分の名前)」の形でアクセスできるようにする
    @GetMapping("/hello/{name}")
    public Greeting hello(@PathVariable String name) {
        return new Greeting("Hello," + name + "!", "English");
    }
}