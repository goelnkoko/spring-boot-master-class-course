package com.springmasterclass.seller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

public class SellerRepository implements SellerRepo{

    @Override
    public List<Seller> getSellers() {
        //TODO. Connect with real db
        return Collections.singletonList(
                new Seller(1L, "TODO. Implement real db", "Sapu", "54637829", "goel@gmail.com")
        );
    }
}
