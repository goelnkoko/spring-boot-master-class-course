package com.springmasterclass.customer;

import com.springmasterclass.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "api/v2/customers")
public class CustomerControllerV2 {

    private final CustomerService customerService;

    @Autowired
    public CustomerControllerV2(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    List<Customer> getCustomers(){
        return customerService.getCustomers();
    }

    @GetMapping(path = "/{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id){
        return customerService.getCustomer(id);
    }

    @GetMapping(path = "/{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id){
        throw new ApiRequestException("ApiRequestException for customer " + id);
    }


    @PostMapping
    void creasteNewCustomer(@Valid @RequestBody Customer customer){
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
