package br.com.hildebrando.api.services.impl;

import br.com.hildebrando.api.domain.User;
import br.com.hildebrando.api.repositories.UserRepository;
import br.com.hildebrando.api.services.UserService;
import br.com.hildebrando.api.services.exceptions.ObjectNotFoundExcepetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User fyndById(Integer id) {
        Optional<User> obj = userRepository.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundExcepetion("User not found! Id: " + id + ", Type: " + User.class.getName()));
    }
}
