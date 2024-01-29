package com.springmasterclass.seller;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

public class SellerFakeRepository implements SellerRepo{

    @Override
    public Seller getSeller() {
        return new Seller(1L, "Goel Nkoko", "Morro Bento");
    }

    @Override
    public List<Seller> getSellers() {
        return Arrays.asList(
                new Seller(1L, "Goel Nkoko", "Morro Bento"),
                new Seller(2L, "Nkembwa Nkumbo", "Kilamba Kiaxi")
        );
    }
}
