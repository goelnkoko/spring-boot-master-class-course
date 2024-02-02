package com.springmasterclass.seller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v2/sellers")
public class SellerControllerV2 {

    private final SellerService sellerService;

    @Autowired
    public SellerControllerV2(SellerService sellerService) {
        this.sellerService = sellerService;
    }

    @GetMapping
    List<Seller> getSellers(){
        return sellerService.getSellers();
    }

    @GetMapping(path = "/{customerId}")
    Seller getSeller(@PathVariable("customerId") Long id){
        return sellerService.getSeller(id);
    }

    @PostMapping
    void createNewSeller(@Valid @RequestBody Seller seller){
        System.out.println("POST REQUEST");
        System.out.println(seller);
    }

    @PutMapping
    void updateSeller(@RequestBody Seller seller){
        System.out.println("PUT REQUEST");
        System.out.println(seller);
    }

    @DeleteMapping(path = "/{customerId}")
    void deleteSeller(@PathVariable("customerId") Long id){
        System.out.println("DELETE REQUEST");
        System.out.println("Deleted seller with id " + id);
    }
}
