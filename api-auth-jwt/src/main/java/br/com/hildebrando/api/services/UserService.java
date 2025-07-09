package br.com.hildebrando.api.services;

import br.com.hildebrando.api.dtos.UserDto;

import java.util.List;

public interface UserService {
    public UserDto save (UserDto user);
    public List<UserDto> getAllUsers (UserDto user);
}
