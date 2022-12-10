package com.example.liquorstore.validator;

import com.example.liquorstore.entity.Account;
import com.example.liquorstore.form.CustomerForm;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class AccountValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz == Account.class;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
