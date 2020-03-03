package com.ddc.projects.springbootinitiate.controller;

import com.ddc.projects.springbootinitiate.model.Person;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestController {

    //http://localhost:8080/helloRest
    @GetMapping("/helloRest")
    public String helloRest() {
        return "hello Rest controller";
    }

    //http://localhost:8080/person/10
    /**
     *{
     *     "id": 10,
     *     "name": "ddc",
     *     "age": 27
     * }
      */
    @RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPersonById(@PathVariable("personId") Integer personId) {
        Person person = new Person();
        person.setId(personId);
        person.setName("ddc");
        person.setAge(27);
        return person;
    }
}
