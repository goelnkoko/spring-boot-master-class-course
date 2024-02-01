package com.springmasterclass.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {

    private final SellerRepo sellerRepo;

    @Autowired
    public SellerService(SellerRepo sellerRepo) {
        this.sellerRepo = sellerRepo;
    }

    Seller getSeller(Long id){
        return sellerRepo.getSellers()
                .stream()
                .filter(seller -> seller.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Seller not found"));
    }

    List<Seller> getSellers(){
        return sellerRepo.getSellers();
    }

}
