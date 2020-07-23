package com.food.FoodModel.Order;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.food.FoodModel.Order.EnumType.DeliveryType;
import com.food.FoodModel.Order.EnumType.PaymentType;



@SuppressWarnings("serial")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order implements Serializable{

  		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id", unique = true)
	private Integer orderId;
	
	@Column(name = "order_number", unique = true)
	private String orderNumber;
        
        @Column(name = "customer_id", unique = true)
	private int customerId;
        
        @Column(name = "food_id", unique = true)
	private int foodId;
	
	@Column(name = "payment_type" )
	private PaymentType paymentType;
	
	@Column(name = "delivery_type")
	private DeliveryType deliveryType;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "quantity")
	private long quantity;
	
	//@JsonIgnore
    //@ManyToOne
    //@JoinColumn(name = "customer_id")
    //private Customer customer;
	
    @Column(name = "date_created", nullable = false, insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    //@JsonIgnore
    //@OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<FoodItem> foods;		

   

}
