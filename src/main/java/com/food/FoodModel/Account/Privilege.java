package com.food.FoodModel.Account;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "privilege")
@Data
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "name")
    private String name;
}

