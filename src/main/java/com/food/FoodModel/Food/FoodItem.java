package com.food.FoodModel.Food;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@SuppressWarnings("serial")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foods")
public class FoodItem implements Serializable{
		
    //@JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "food_id", nullable = false, unique = true)
    private Integer foodId;		

    @Column(name = "food_name", nullable = false)
    private String foodName;
	
    @Column(name = "price", nullable = false)
    private double price;
    
   //@ManyToOne
   /// @JoinColumn(name = "order_id")
    //private Order order;


  

	
	

}
