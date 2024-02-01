package com.springmasterclass.seller;

import com.springmasterclass.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class SellerController {

    private final SellerService sellerService;

    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping("/seller/{id}")
    Seller getSeller(){
        return sellerService.getSeller();
    }

    @GetMapping("/seller")
    List<Seller> getSellers(){
        return sellerService.getSellers();
    }
}
