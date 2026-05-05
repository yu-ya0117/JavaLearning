package com.example.hello_springboot;

//POSTリクエストで受け取るJSONをマッピングするクラス
public class GreetingRequest{
    private String name;
    private String language;

    //以下getterとsetter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }
}