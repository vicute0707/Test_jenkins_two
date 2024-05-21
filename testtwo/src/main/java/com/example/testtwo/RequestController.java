package com.example.testtwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api")
public class RequestController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/animal/{id}")
    public ResponseEntity<AnimalDto> findById(@PathVariable int id) {
        String url = "http://localhost:8088/api/find/"+id;
        AnimalDto animaldto = null;
        ResponseEntity<AnimalDto> responseEntity = restTemplate.getForEntity(url, AnimalDto.class);
        animaldto = responseEntity.getBody();
        return new ResponseEntity<>(animaldto, HttpStatus.OK);
    }
}
