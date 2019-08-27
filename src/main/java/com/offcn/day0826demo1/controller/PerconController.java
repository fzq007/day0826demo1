package com.offcn.day0826demo1.controller;

import com.offcn.day0826demo1.bean.Person;
import com.offcn.day0826demo1.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PerconController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(path="addPerson")
    public void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }


    @GetMapping(path="getAllPerson")
    public List<Person> getPerson(){
        return personRepository.findAll();
    }

    @DeleteMapping(path="deletePerson")
    public void deletePerson(@RequestParam Long id) {
        personRepository.deleteById(id);
    }

    @PutMapping(path="updatePerson")
    public void updatePerson(@RequestBody Person person) {
        personRepository.saveAndFlush(person);
    }


}
