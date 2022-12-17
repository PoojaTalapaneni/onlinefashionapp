package com.fashion.gtest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fashion.gtest.entity.Order;
import com.fashion.gtest.service.OrderService;

@RestController
@RequestMapping("/myorder")
public class MyWebController {

	@Autowired
	OrderService orderService;
	@PostMapping("/add")
	public ResponseEntity<String> addOrder(@RequestBody Order order) {
		try {
			Order savedOrder = orderService.addOrder(order);
			String responseMsg = savedOrder.getOrderDate() + "save with id" + savedOrder.getId();
			return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
		} catch (Exception e) {
			String errorMsg = "Contact to customer care 19876-89-876 or mail us:- care@capg.com";
			return new ResponseEntity<String>(errorMsg, HttpStatus.OK);
		}
	}

	@GetMapping("/allOrder")
	public List<Order> getAllOrders() {
	
		try {
			List<Order> allExtractedOrders = orderService.getAllOrders();

			return allExtractedOrders;

		} catch (Exception e) {
			
			System.out.println(e);

		}

		return null;
	}

	@GetMapping("/orderid/{searchId}")
	public List<Order> getOrderById(@PathVariable int searchId) throws Exception {

		return orderService.getOrderById(searchId);

	}

	@GetMapping("/ordercost/{searchTotalordercost}")
	public Order getOrderByTotalOrderCost(@PathVariable int searchTotalordercost) throws Exception {
		return orderService.getOrderByTotalOrderCost(searchTotalordercost);
	}

	@PutMapping("/update")
	public ResponseEntity<Order> updateOrder(@RequestBody Order order) throws Exception {
		Order savedOrder = orderService.addOrder(order);
		return new ResponseEntity<Order>(savedOrder, HttpStatus.CREATED);

	}

	@DeleteMapping("/id")
	public void deleteOrderById(@RequestParam int id) {
		try {
			orderService.deleteOrderById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@GetMapping("/userName/{searchUsername}")
	public List<Order> getAllOrdersByUserName(@PathVariable String searchUsername) throws Exception {
		return orderService.getAllOrdersByUserName(searchUsername);
	}

	@GetMapping("/orderDate/{searchOrderdate}")
	public Order getOrderByOrderDate(@PathVariable String searchOrderdate) throws Exception {
		return orderService.getOrderByOrderDate(searchOrderdate);
	}

	@GetMapping("/filteruserName/{userName}")
	public List<Order> filterOrder(@PathVariable String userName) throws Exception {
		List<Order> allfiltered = orderService.filterByuserName(userName);
		return allfiltered;
	}

	@GetMapping("/filterstatus/{status}")
	public List<Order> filterOrder1(@PathVariable String status) throws Exception {
		List<Order> allfiltered = orderService.filterBystatus(status);
		return allfiltered;
	}

	@GetMapping("/filterorderDate/{orderDate}")
	public List<Order> filterOrder2(@PathVariable String orderDate) throws Exception {
		List<Order> allfiltered = orderService.filterByorderDate(orderDate);
		return allfiltered;
	}

	@GetMapping("/sort/userName")
	public List<Order> getBysorting() throws Exception {
		List<Order> allOrder = orderService.sortingBasedOnuserName();
		return allOrder;
	}

	@GetMapping("/sort/orderDate")
	public List<Order> getBysorting1() throws Exception {
		List<Order> allOrder = orderService.sortingBasedOnorderDate();
		return allOrder;
	}

}
