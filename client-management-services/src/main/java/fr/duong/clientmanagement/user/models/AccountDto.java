package fr.duong.clientmanagement.user.models;

import lombok.Data;
import lombok.ToString;

/**
 * @author van.duong
 */
@Data
@ToString
public class AccountDto {

    private String accountName;
    private int balance;
}
