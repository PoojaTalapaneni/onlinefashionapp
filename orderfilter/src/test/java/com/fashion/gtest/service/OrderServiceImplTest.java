package com.fashion.gtest.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import com.fashion.gtest.entity.Order;
import com.fashion.gtest.repository.OrderRepository;
@SpringBootTest
class OrderServiceImplTest {
	@Mock
	OrderRepository orderRepository;
	
	@InjectMocks
	OrderServiceImpl orderService;
	

	@Test
	//@Disabled
     @DisplayName(" add orders")
	void testAddOrder()throws Exception{
	   
	//given
	    Order sampleInput = new Order(1, "keerthi","10-april-2022", 1000,"shipping");
		Order expectedOutput = new Order(1, "keerthi","10-april-2022", 1000,"shipping");
		BDDMockito.given(orderService.addOrder(sampleInput)).willReturn(expectedOutput);
		
		// when 
		Order actualOutput = orderService.addOrder(sampleInput);
		
		 //verify 
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	//@Disabled
	@DisplayName("Get all orders")
	void testGetAllOrders() throws Exception {
		Order order1=new Order(1,"A","15/11/2022", 1, "status");
		Order order2=new Order(2,"B","16/11/2022", 2, "status");
		List<Order> sampleOutput = new ArrayList<>();
		sampleOutput.add(order1);
		sampleOutput.add(order2);
		BDDMockito.given(orderService.getAllOrders()).willReturn(sampleOutput);
		
		//when
		List<Order> actualOutput = orderService.getAllOrders();
		//verify
		assertEquals(sampleOutput,actualOutput);
		assertSame(sampleOutput.add(order1),actualOutput.add(order2));

	}
	@Test
	//@Disabled
	@DisplayName("update orders")
	void testUpdateOrder() throws Exception {
		
	    //given
	 	    Order sampleInput = new Order(1, "A","A", 1,"status");
	 		Order expectedOutput = new Order(1, "A","A", 1,"status");
	 		BDDMockito.given(orderService.addOrder(sampleInput)).willReturn(expectedOutput);
	 		
	 		// when 
	 		Order actualOutput = orderService.addOrder(sampleInput);
	 		
	 		 //verify 
	 		assertEquals(expectedOutput, actualOutput);
		}
	@Test
	@Disabled
	void testDeleteOrderById() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAllOrdersByUserName() {
		fail("Not yet implemented");	
	}

	@Test
	@DisplayName("Get order by order date")
	void testGetOrderByOrderDate() throws Exception{
			Order sampleOutput = new Order(1,"A","12/02/2022",200,"Yes");
			//given
			sampleOutput.setOrderDate("12/02/2022");
			String sampleInput = "12/02/2022";
			BDDMockito.given(orderService.getOrderByOrderDate(sampleInput)).willReturn(sampleOutput);
	     
			//when
			Order actualOutput = orderService.getOrderByOrderDate(sampleInput);
			
			//verify
			assertEquals(sampleOutput,actualOutput);
			assertSame(sampleOutput.getOrderDate(),actualOutput.getOrderDate());
	}

	@Test
	@DisplayName("Get order by total order cost")
	//@Disabled
	void testGetOrderByTotalOrderCost()throws Exception {
		Order sampleOutput = new Order(1,"A","15/11/2022",1,"Delivered");
		//given
		sampleOutput.setTotalOrderCost(1);
		int sampleInput = 1;
		BDDMockito.given(orderService.getOrderByTotalOrderCost(sampleInput)).willReturn(sampleOutput);
     
		//when
		Order actualOutput = orderService.getOrderByTotalOrderCost(sampleInput);
		
		//verify
		assertEquals(sampleOutput,actualOutput);
		assertSame(sampleOutput.getTotalOrderCost(),actualOutput.getTotalOrderCost());

	}
	@Test
	@Disabled
	void testGetOrderById() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFilterByuserName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFilterBystatus() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testFilterByorderDate() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortingBasedOnuserName() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testSortingBasedOnorderDate() {
		fail("Not yet implemented");
	}

}
