package com.springmasterclass.seller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

public class SellerRepository implements SellerRepo{

    @Override
    public List<Seller> getSellers() {
        return Collections.emptyList();
    }
}
