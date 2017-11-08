package fr.duong.clientmanagement.user.services;

import fr.duong.clientmanagement.user.models.AccountDto;
import fr.duong.clientmanagement.user.models.UserDto;

import java.io.IOException;

/**
 * @author van.duong
 */
public class UserService implements IUserService {
    @Override
    public void createNewClient(UserDto userDto) {

    }

    @Override
    public void updateClientInfo(String id, UserDto userDto) {

    }

    @Override
    public UserDto getClientById(String id) throws IOException {
        return null;
    }

    @Override
    public UserDto getClientByFirstName(String firstName) throws IOException {
        return null;
    }

    @Override
    public UserDto getClientByLastName(String lastName) throws IOException {
        return null;
    }

    @Override
    public void createAccount(String id, AccountDto accountDto) {

    }
}
