package com.educandoweb.projeto.resources;

import com.educandoweb.projeto.entitties.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/users")
//aqui eu to nomeando como o meu recurso sera chamado na minha URL
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(4L,"kamilla","kamillal@gmail","1884839","212");
        return ResponseEntity.ok().body(u);
    }
}
