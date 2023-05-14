package com.example.springapi.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
  @GetMapping(value = "/api")
  public String getTestData() {
    String helloWorld = "Hello World!";

    return helloWorld;
  }

  @GetMapping(value = "/api/greeting/{name}")
  public String getTestData(@PathVariable String name) {
    String greeting = "Hello " + name + ", nice to meet you!";

    return greeting;
  }
}