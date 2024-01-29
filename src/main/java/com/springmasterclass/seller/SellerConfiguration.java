package com.springmasterclass.seller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SellerConfiguration {

    @Value("${app.useFakeSellerRepo:false}")
    private boolean useFakeSellerRepo;

    @Bean
    SellerRepo useFakeSellerRepo(){
        System.out.println("useFakeSellerRepo = " + useFakeSellerRepo);
        return useFakeSellerRepo ?
                new SellerFakeRepository() :
                new SellerRepository();
    }
}
