package com.offcn.day0826demo1.controller;

import com.offcn.day0826demo1.bean.Person;
import com.offcn.day0826demo1.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person2")
public class Person2Controller {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("findByNameIs/{name}")
    public Person findByNameIs(@PathVariable String name) {
        return personRepository.findByNameIs(name);
    }

    @GetMapping("findByNameIsAndPassword/{name}/{password}")
    public Person findByNameIsAndPassword(@PathVariable String name,@PathVariable String password) {
        return personRepository.findByNameIsAndPassword(name, password);
    }

    @GetMapping("findByNameContaining/{name}")
    public List<Person> findByNameContaining(@PathVariable String name) {
        return personRepository.findByNameContaining(name);
    }


}
