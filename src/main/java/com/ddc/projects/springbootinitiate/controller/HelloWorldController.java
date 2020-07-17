package com.ddc.projects.springbootinitiate.controller;

import com.ddc.projects.springbootinitiate.model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String helloRest() {
        return "hello world";
    }


    @GetMapping("/helloworld1")
    public ResponseEntity helloRest1() {
        return new ResponseEntity("hello world", HttpStatus.OK);
    }


    @GetMapping("/helloworld2")
    public ResponseEntity helloRest2() {
        return new ResponseEntity("hello world with wrong parameters", HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/helloworld3")
    public ResponseEntity<Person> helloRest3() {
        Person person = new Person();
        person.setId(1);
        person.setName("ddc");
        person.setAge(27);
        return new ResponseEntity(person, HttpStatus.OK);
    }
}
