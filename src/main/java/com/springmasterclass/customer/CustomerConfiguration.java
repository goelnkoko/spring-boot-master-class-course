package com.springmasterclass.customer;

import org.springframework.aop.scope.ScopedProxyUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Value("${app.useFakeCustomerRepo:false}")
    private boolean useFakeCustomerRepo;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            System.out.println("Comand Line Runner Hooray");
        };
    }

    @Bean
    CustomerRepo customerRepo(){
        System.out.println("useFakeRepository = " + useFakeCustomerRepo);
        return new CustomerFakeRepository();
    }


}
