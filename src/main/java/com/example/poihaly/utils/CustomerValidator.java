package com.example.poihaly.utils;

import com.example.poihaly.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class CustomerValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(Customer.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Customer customer = (Customer) o;
        if (customer.getUsername().length()<4){
            errors.rejectValue("username","message.username.error");

        }
        if (customer.getPassword().length()<4){
            errors.rejectValue("password","message.password.error");
        }
        if (customer.getUsername().isEmpty()||
                customer.getPassword().isEmpty()||
                customer.getName().isEmpty()||
                customer.getSurname().isEmpty()||
                customer.getCity().isEmpty()||
                customer.getEmail().isEmpty()

                ) {
            errors.rejectValue("username","message.empty.error");
        }
        if (customer.getAge()<=4||customer.getAge()>=120) {
            errors.rejectValue("age", "message.age.error");
        }

    }

}
