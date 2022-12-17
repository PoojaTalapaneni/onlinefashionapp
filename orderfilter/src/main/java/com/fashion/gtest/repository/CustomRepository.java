package com.fashion.gtest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fashion.gtest.entity.Order;

@Repository
public interface CustomRepository {

	public List<Order> getAllOrdersByUserName(String userName) throws Exception;

	public Order getOrderByOrderDate(String orderDate) throws Exception;

	public Order getOrderByTotalOrderCost(int totalOrderCost) throws Exception;

	public List<Order> getOrderById(int id) throws Exception;

}