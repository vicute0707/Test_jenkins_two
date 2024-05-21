package com.example.testck;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnimalController {
    @Autowired
    RepoAnimal repoAnimal;

    @GetMapping("/list")
    public List<Animal> getListAnimal() {
        List<Animal> list = new ArrayList<>();
        list = repoAnimal.findAll();
        return list;
    }

    @PostMapping("/save")
    public Animal saveAnimal(@RequestBody Animal animal) {
        repoAnimal.save(animal);
        return animal;
    }

    @GetMapping("/find/{id}")
    public Animal findById(@PathVariable int id) {
        Optional<Animal> optional = repoAnimal.findById(id);
        Animal animal = null;
        if (optional.isPresent()) {
            animal = optional.get();
        } else {
            throw new RuntimeException("Loi khog tim thay," + id);
        }
        return animal;
    }

    @GetMapping("/hello")
    public String getHello() {
        return "Hello cac bn!";
    }

}
