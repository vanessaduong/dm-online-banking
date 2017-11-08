package fr.ekinci.clientmanagement.user.repositories;

import fr.ekinci.clientmanagement.user.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	List<UserEntity> findAll();
}
