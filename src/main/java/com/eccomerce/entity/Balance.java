package com.eccomerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Data
public class Balance extends BaseEntity{

    private BigDecimal amount;
    @OneToOne//defining relationships
    private Customer customer;

}
