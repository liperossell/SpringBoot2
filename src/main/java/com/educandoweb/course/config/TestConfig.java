package com.educandoweb.course.config;

import java.util.Arrays;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Dinho", "fometa@fometa.com.br", "4855555555", "dindino");
        User u2 = new User(null, "UniMagic", "glitinhos@mundorosa.com.br", "4855555555", "xuxu");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}