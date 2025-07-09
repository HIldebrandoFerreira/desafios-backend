package br.com.hildebrando.api.config;

import br.com.hildebrando.api.domain.User;
import br.com.hildebrando.api.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    private UserRepository repository;

    @Bean
    public void startDB(){
        User user = new User(null,"Hildebrando","webrando@gmail.com", "123456");
        User user2 = new User(null,"Novo User","novo-email@gmail.com", "135791");

        repository.saveAll(List.of(user,user2));
    }
}
