package com.food.FoodModel.Customer;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer implements Serializable{

    
	//@JsonIgnore
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id", nullable = false, unique = true)
	private Integer customerId;
		
        @Column(name = "firstname")
	private String firstName;
        
        @Column(name = "lastname")
	private String lastName;
        
	@Column(name = "phone")
	private String phoneNumber;
        
         @Column(name = "address")
	private String address;
		
	//@JsonIgnore
        //@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
	//private List<Order> orders;
	
       /*@OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "user_id", unique = true, nullable = false, insertable = true, updatable = true)
	private Users user;*/


		
		
}
