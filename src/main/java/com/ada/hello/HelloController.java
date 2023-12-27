package com.ada.hello;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("hello world");

    }
    @DeleteMapping("/hello")
    public  String deleteHello() {
        return "delete hello";
    }
    @GetMapping("/hello2")
    public String hello2() {
        return "hello ADA2";

    }
    @GetMapping("/dogs")
    public Dog getdog() {
        return new Dog("ルイー", "パピヨン",5);

    }
}
