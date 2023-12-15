package com.eccomerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity// annotation to create a table, also we need to add a primary key -> for that add annotation @Id
@NoArgsConstructor
@Data
public class Customer extends BaseEntity{

    private String firstName;
    private String lastName;
    private String userName;
    private String email;


}
