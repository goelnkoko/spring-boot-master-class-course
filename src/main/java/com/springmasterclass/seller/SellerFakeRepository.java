package com.springmasterclass.seller;

import java.util.Arrays;
import java.util.List;

public class SellerFakeRepository implements SellerRepo{

    @Override
    public List<Seller> getSellers() {
        return Arrays.asList(
                new Seller(1L, "Goel Nkoko", "Morro Bento", "123password", "email@gmail.com"),
                new Seller(2L, "Nkembwa Nkumbo", "Kilamba Kiaxi", "123password", "email@gmail.com")
        );
    }
}
