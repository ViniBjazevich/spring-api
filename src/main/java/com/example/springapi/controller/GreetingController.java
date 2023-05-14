package com.example.springapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.example.springapi.dto.MessageDTO;

@RestController
public class GreetingController {

  @GetMapping(value = "/api")
  public String getHelloWorld() {
    String helloWorld = "Hello World!";

    return helloWorld;
  }

  @GetMapping(value = "/api/greeting/{name}")
  public String getGreeting(@PathVariable String name) {
    String greeting = "Hello " + name + ", nice to meet you!";

    return greeting;
  }

  @PostMapping(value = "/api/message")
  public String createMessage(@RequestBody MessageDTO messageDTO) {
    String response = messageDTO.getTitle() + " was successfully added to the database";

    return response;
  }
}