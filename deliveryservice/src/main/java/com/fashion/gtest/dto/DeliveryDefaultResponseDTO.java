package com.fashion.gtest.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class DeliveryDefaultResponseDTO implements MyDTO {

	private int orderNumber;
	private String productName;
	private int cost;
	private String date;
	private String location;
	private String address;
	private String deliveryStatus;

	
	
}
