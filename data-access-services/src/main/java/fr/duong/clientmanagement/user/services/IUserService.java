package fr.duong.clientmanagement.user.services;

import fr.duong.clientmanagement.user.models.UserDto;

import java.util.List;
import java.util.Optional;

public interface IUserService {

	List<UserDto> getAll();

	Optional<UserDto> getUserById(String id);

	UserDto create(UserDto userDto);

	void delete(String id);

	void update(String id, UserDto userDto);
}
