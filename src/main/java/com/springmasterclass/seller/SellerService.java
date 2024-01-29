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

    Seller getSeller(){
        return sellerRepo.getSeller();
    }

    List<Seller> getSellers(){
        return sellerRepo.getSellers();
    }

}
