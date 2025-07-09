package br.com.hildebrando.api.services;

import br.com.hildebrando.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
