package com.eccomerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Address extends BaseEntity{

    private String name;
    private String street;
    private String zipCode;

    @ManyToOne
    private Customer customer;

}
