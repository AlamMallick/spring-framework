package com.cydeo.controller;

import com.cydeo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class Consume_RESTtemplate {


    private final String Uri= "https://jsonplaceholder.typicode.com/users";

    private final RestTemplate restTemplate;

    public Consume_RESTtemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @GetMapping
    public User[] readAllUser(){

      ResponseEntity<User[]>  responseEntity= restTemplate.getForEntity(Uri,User[].class);  //json object and it to dto

        return responseEntity.getBody();

    }
}
