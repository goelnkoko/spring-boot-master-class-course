package com.springmasterclass.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/customer")
@Deprecated
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("customerId")
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @PostMapping
    void creasteNewCustomer(@RequestBody Customer customer){
        System.out.println("POSTMAPPING...");
        System.out.println(customer);
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer){
        System.out.println("PUTMAPPING...");
        System.out.println(customer);
    }

    @DeleteMapping(path = "/{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id){
        System.out.println("DELETE MAPPING WITH CUSTOMER ID + " + id );
    }

}
