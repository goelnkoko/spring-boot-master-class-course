package com.springmasterclass.seller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Seller {

    private final Long id;
    private final String name;
    private final String address;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    public Seller(Long id, String name, String address, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    @JsonProperty("sellerId")
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seller seller = (Seller) o;
        return Objects.equals(id, seller.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
