package com.fashion.gtest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class DeliveryAgent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	private int orderNumber;
	private String productName;
	private int cost;
	private String date;
	private String location;
	private String address;
	private String deliveryStatus;
	public DeliveryAgent(int orderNumber, String productName, int cost, String date, String location, String address,
			String deliveryStatus) {
		super();
		this.orderNumber = orderNumber;
		this.productName = productName;
		this.cost = cost;
		this.date = date;
		this.location = location;
		this.address = address;
		this.deliveryStatus = deliveryStatus;
	}

}
