package br.com.hildebrando.api.repositories;

import br.com.hildebrando.api.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
}
