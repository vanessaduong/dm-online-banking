package fr.duong.clientmanagement.user.services;

import fr.duong.clientmanagement.user.models.AccountDto;
import fr.duong.clientmanagement.user.models.UserDto;

import java.io.IOException;

/**
 * @author van.duong
 */
public interface IUserService {

    void createNewClient(UserDto userDto);

    void updateClientInfo(String id, UserDto userDto);

    UserDto getClientById(String id) throws IOException;

    UserDto getClientByFirstName(String firstName) throws IOException;

    UserDto getClientByLastName(String lastName) throws IOException;

    void createAccount(String id, AccountDto accountDto);
}
