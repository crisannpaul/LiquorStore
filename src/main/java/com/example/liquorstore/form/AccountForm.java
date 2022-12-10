package com.example.liquorstore.form;

import com.example.liquorstore.model.AccountInfo;

public class AccountForm {

    private String userName;

    private String encryptedPassword;

    public AccountForm() {}

    public AccountForm(AccountInfo accountInfo) {
        if(accountInfo != null) {
            this.userName = accountInfo.getUserName();
            this.encryptedPassword = accountInfo.getEncryptedPassword();
        }
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
