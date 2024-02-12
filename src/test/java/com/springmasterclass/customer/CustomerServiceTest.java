package com.springmasterclass.customer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerServiceTest {

    @Autowired
    private CustomerRepository customerRepository;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerRepository);
    }

    @AfterEach
    void tearDown() {
        customerRepository.deleteAll();
    }

    @Test
    void getCustomers() {
        // given
        Customer jamila = new Customer(1L, "Jamila", "12345", "jamila@gmail.com");
        Customer kassy = new Customer(2L, "Kassy", "12345", "kassya@gmail.com");

        customerRepository.saveAll(Arrays.asList(jamila, kassy));

        // when
        List<Customer> customers = underTest.getCustomers();

        // then
        assertEquals(2, customers.size());
    }

    @Test
    void getCustomer() {

        // given
        Customer jamila = new Customer(1L, "Jamila", "12345", "jamila@gmail.com");

        customerRepository.save(jamila);

        // when
        Customer actual = underTest.getCustomer(1L);

        // then
        assertEquals(1L, actual.getId());
        assertEquals("Jamila", actual.getName());
        assertEquals("12345", actual.getPassword());
        assertEquals("jamila@gmail.com", actual.getEmail());
    }
}