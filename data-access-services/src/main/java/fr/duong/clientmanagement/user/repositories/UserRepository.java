package fr.duong.clientmanagement.user.repositories;

import fr.duong.clientmanagement.user.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long> {
	List<UserEntity> findAll();
}
