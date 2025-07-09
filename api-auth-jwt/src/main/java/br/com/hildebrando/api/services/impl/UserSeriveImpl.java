package br.com.hildebrando.api.services.impl;

import br.com.hildebrando.api.dtos.UserDto;
import br.com.hildebrando.api.repositories.UserRepository;
import br.com.hildebrando.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSeriveImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDto save(UserDto user) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers(UserDto user) {
        return List.of();
    }
}
