package com.springmasterclass.seller;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class SellerFakeRepository implements SellerRepo{

    @Override
    public Seller getSeller() {
        return new Seller(1L, "Goel Nkoko", "Morro Bento", "123password");
    }

    @Override
    public List<Seller> getSellers() {
        return Arrays.asList(
                new Seller(1L, "Goel Nkoko", "Morro Bento", "123password"),
                new Seller(2L, "Nkembwa Nkumbo", "Kilamba Kiaxi", "123password")
        );
    }
}
