package com.example.liquorstore.model;

import com.example.liquorstore.entity.Account;

public class AccountInfo {

    private String userName;

    private String encryptedPassword;

    public AccountInfo(){}

    public AccountInfo(Account account) {
        this.userName = account.getUserName();
        this.encryptedPassword = account.getEncrytedPassword();
    }

    public AccountInfo(String userName, String encryptedPassword) {
        this.userName = userName;
        this.encryptedPassword = encryptedPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}
