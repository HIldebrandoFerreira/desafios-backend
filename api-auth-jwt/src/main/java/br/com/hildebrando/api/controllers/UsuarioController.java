package br.com.hildebrando.api.controllers;

import br.com.hildebrando.api.dtos.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @PostMapping
    private UserDto save(@RequestBody UserDto user){
        return user;
    }

    @GetMapping
    private List<UserDto> getAllUsers(){
        return new ArrayList<>();
    }
}
