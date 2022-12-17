package com.fashion.gtest.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.fashion.gtest.dto.OrderDefaultResponseDTO;
import com.fashion.gtest.entity.Order;

@Component
@Scope("singleton")
public class OrderDTOConvertor {
	public static OrderDefaultResponseDTO getOrderDefaultDTO(Order order)
	{
		OrderDefaultResponseDTO dto = new OrderDefaultResponseDTO(
				                           order.getOrderDate(),
				                           order.getStatus(),
				                           order.getTotalOrderCost(),
				                           order.getUserName());
				                    
				                            
				return dto;
	}

}
