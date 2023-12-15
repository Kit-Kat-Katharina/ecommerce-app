package com.ecommerce.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class Category extends BaseEntity{
    private String name;

    private List<Product> productList;


}
