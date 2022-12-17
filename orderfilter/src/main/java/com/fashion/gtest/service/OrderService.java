package com.fashion.gtest.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.fashion.gtest.entity.Order;

@Service
public interface OrderService {

	public Order addOrder(Order order) throws Exception;

	public List<Order> getAllOrders() throws Exception;

	public Order updateOrder(Order order) throws Exception;

	public void deleteOrderById(int id);

	public List<Order> getAllOrdersByUserName(String userName) throws Exception;

	public Order getOrderByOrderDate(String orderDate) throws Exception;

	public Order getOrderByTotalOrderCost(int totalOrderCost) throws Exception;

	public List<Order> getOrderById(int id) throws Exception;

	public List<Order> filterByorderDate(String orderDate) throws Exception;

	public List<Order> filterBystatus(String status) throws Exception;

	public List<Order> filterByuserName(String userName) throws Exception;

	public List<Order> sortingBasedOnuserName() throws Exception;

	public List<Order> sortingBasedOnorderDate() throws Exception;

}
