package com.fashion.gtest.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.fashion.gtest.Entity.DeliveryAgent;
import com.fashion.gtest.Repository.DeliveryAgentRepository;
@SpringBootTest
class DeliveryAgentServiceImplTest {
	@Mock
	DeliveryAgentRepository deliveryAgentRepository;
	
	@InjectMocks
	DeliveryAgentServiceImpl deliveryAgentService;
	@Test
	//@Disabled
	@DisplayName(" add deliveryagentservice")
	void testAddDeliveryAgent() throws Exception {
		DeliveryAgent sampleInput =new DeliveryAgent(1,1, "a", 2, "a", "a", "a", "a");
		DeliveryAgent expectedOutput =new DeliveryAgent(1, 1,"a", 2, "a", "a", "a", "a");
		BDDMockito.given(deliveryAgentService.addDeliveryAgent(sampleInput)).willReturn(expectedOutput);
		// when 
				DeliveryAgent actualOutput = deliveryAgentService.addDeliveryAgent(sampleInput);
				
				 //verify 
				assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@Disabled
	@DisplayName("Update deliveryagentservice")
	void testUpdateDeliveryAgent() throws Exception {
		DeliveryAgent sampleInput =new DeliveryAgent(1,1, "a", 2, "a", "a", "a", "a");
		DeliveryAgent expectedOutput =new DeliveryAgent(1, 1,"a", 2, "a", "a", "a", "a");
		
		BDDMockito.given(deliveryAgentService.updateDeliveryAgent(sampleInput)).willReturn(expectedOutput);
		// when 
				DeliveryAgent actualOutput = deliveryAgentService.updateDeliveryAgent(sampleInput);
				
				 //verify 
				assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@Disabled
	void testGetDeliveryAgentByDate() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	@DisplayName("Cost deliveryagentservice")
	void testGetDeliveryAgentByCost() throws Exception {
		DeliveryAgent sampleInput =new DeliveryAgent(1,1, "a", 2, "a", "a", "a", "a");
		DeliveryAgent expectedOutput =new DeliveryAgent(1, 1,"a", 2, "a", "a", "a", "a");
		
		BDDMockito.given(deliveryAgentService.updateDeliveryAgent(sampleInput)).willReturn(expectedOutput);
		// when 
				DeliveryAgent actualOutput = deliveryAgentService.updateDeliveryAgent(sampleInput);
				
				 //verify 
				assertEquals(expectedOutput, actualOutput);
	}

	@Test
	@Disabled
	void testDeleteDeliveryAgentByUserId() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetDeliveryAgentByUserId() {
		fail("Not yet implemented");
	}

	@Test
	@Disabled
	void testGetAllDeliveryAgents() {
		fail("Not yet implemented");
	}

}
