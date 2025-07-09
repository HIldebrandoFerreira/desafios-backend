package br.com.hildebrando.api.controllers;

import br.com.hildebrando.api.domain.dto.UserDto;
import br.com.hildebrando.api.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private ModelMapper mapper;

    @Autowired
    private UserService userService;


    @GetMapping("/{id}")
    public ResponseEntity<UserDto> fyndById(@PathVariable Integer id) {
        return  ResponseEntity.ok().body(mapper.map(userService.findById(id), UserDto.class));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> fyndAll(@PathVariable Integer id) {
        return  ResponseEntity.ok().body(userService.findAll().stream()
                .map(user -> mapper.map(user, UserDto.class)).collect(Collectors.toList()));
    }
}
