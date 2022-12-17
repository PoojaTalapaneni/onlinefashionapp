package com.fashion.gtest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashion.gtest.entity.Order;
import com.fashion.gtest.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepository;

	@Override
	public Order addOrder(Order order) throws Exception {
		Order savedOrder=orderRepository.save(order);
		return savedOrder;

	}

	@Override
	public List<Order> getAllOrders() throws Exception {
		List<Order> allOrders=orderRepository.findAll();
		return allOrders;

	}

	@Override
	public Order updateOrder(Order order) throws Exception {
		Order savedOrder=orderRepository.save(updateOrder(order));
		return savedOrder;

	}

	@Override
	public void deleteOrderById(int Id) {
		orderRepository.deleteById(Id);
	}

	@Override
	public List<Order> getAllOrdersByUserName(String userName) throws Exception {
		System.out.println("------>>Inside service Impl userName"+userName);
		return orderRepository.getAllOrdersByUserName(userName) ;

	}

	@Override
	public Order getOrderByOrderDate(String orderDate) throws Exception {
		 return orderRepository.getOrderByOrderDate(orderDate);
	}

	@Override
	public Order getOrderByTotalOrderCost(int totalOrderCost) throws Exception {
		Order order = orderRepository.getOrderByTotalOrderCost(totalOrderCost);
		 return order;
	}

	@Override
	public List<Order> getOrderById(int id) throws Exception{
		System.out.println("------>>Inside service Impl id"+id);
		return orderRepository.getOrderById(id);

	}

}