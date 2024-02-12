package com.springmasterclass.customer;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Goel Nkoko", "password123", "email@gmail.com"),
                new Customer(2L, "Nkembwa Nkumbo", "123password", "email@gmail.com"),
                new Customer(3L, "Kamu Nkoko", "pass123word", "email@gmail.com")
        );
    }

}
