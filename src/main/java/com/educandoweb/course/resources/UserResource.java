package com.educandoweb.course.resources;

import java.util.List;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public ResponseEntity<User> findAll(){
        List<User> lista = userRepository.findAll();
        return ResponseEntity.ok().body(lista.get(0));
    }    
}