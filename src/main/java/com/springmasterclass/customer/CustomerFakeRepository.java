package com.springmasterclass.customer;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "Goel Nkoko", "password123"),
                new Customer(2L, "Nkembwa Nkumbo", "123password"),
                new Customer(3L, "Kamu Nkoko", "pass123word")
        );
    }

}
