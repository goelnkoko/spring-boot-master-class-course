package com.springmasterclass.seller;

import com.springmasterclass.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/sellers")
@Deprecated
public class SellerController {

    private final SellerService sellerService;

    @Autowired
    public SellerController(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    List<Seller> getSellers(){
        return sellerService.getSellers();
    }

    @PostMapping
    void createNewSeller(@RequestBody Seller seller){
        System.out.println("POST REQUEST");
        System.out.println(seller);
    }

    @PutMapping
    void updateSeller(@RequestBody Seller seller){
        System.out.println("PUT REQUEST");
        System.out.println(seller);
    }

    @DeleteMapping("/{customerId}")
    void deleteSeller(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST");
        System.out.println("Deleted seller with id " + id);
    }
}
