package com.springmasterclass.seller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Objects;

public class Seller {

    private final Long id;

    @NotBlank(message = "field name must be not empty")
    private final String name;
    @NotBlank(message = "field address must be not empty")
    private final String address;
    @Email
    @NotBlank(message = "field email must be not empty")
    private final String email;
    @NotBlank(message = "field password must be not empty")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private final String password;

    Seller(Long id, String name, String address, String password, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
        this.email = email;
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

    public String getEmail() {
        return email;
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
