package br.com.hildebrando.api.controllers;

import br.com.hildebrando.api.domain.User;
import br.com.hildebrando.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public ResponseEntity<User> fyndById(@PathVariable Integer id) {

        return  ResponseEntity.ok().body(userService.fyndById(id));
    }
}
