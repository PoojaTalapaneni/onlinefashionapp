package com.fashion.gtest.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fashion.gtest.Entity.DeliveryAgent;
import com.fashion.gtest.dto.DeliveryDefaultResponseDTO;

@Component
@Scope("singleton")
public class DeliveryDTOConvertor {
	
	public static DeliveryDefaultResponseDTO getOrderDefaultDTO(DeliveryAgent deliveryAgent)
	{
		DeliveryDefaultResponseDTO dto = new DeliveryDefaultResponseDTO(
				                           deliveryAgent.getOrderNumber(),
				                          deliveryAgent.getProductName(),
				                           deliveryAgent.getCost(),
				                           deliveryAgent .getDate(),
				                            deliveryAgent.getAddress(),
				                            deliveryAgent.getDeliveryStatus(),
				                            deliveryAgent.getLocation());
		
		return dto;
	}
}