package com.fashion.gtest.Controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.fashion.gtest.Entity.DeliveryAgent;
import com.fashion.gtest.Service.DeliveryAgentService;

@RestController
@RequestMapping("/MydeliveryAgent")

public class MyWebController {
@Autowired
DeliveryAgentService deliveryAgentService;
	
@PostMapping("/add")
public ResponseEntity<String> addDeliveryAgent(@RequestBody DeliveryAgent deliveryAgent)
{
	try {
		DeliveryAgent savedDeliveryAgent = deliveryAgentService.addDeliveryAgent(deliveryAgent);
		String responseMsg = savedDeliveryAgent.getDate()+"save with id"+savedDeliveryAgent.getUserId();
		return new ResponseEntity<String>(responseMsg,HttpStatus.OK);
	} catch(Exception e) {
		String errorMsg = "Contact to customer care 19876-89-876 or mail us:- care@capg.com";
		return new ResponseEntity<String>(errorMsg,HttpStatus.OK);
	}
}
@GetMapping("/allDeliveryAgents")
public List<DeliveryAgent> getAllDeliveryAgents()
{
	// write some code to extract users
	try {
		List<DeliveryAgent>  allExtractedDeliveryAgents = deliveryAgentService.getAllDeliveryAgents();
		
		return allExtractedDeliveryAgents;
		
	} catch (Exception e) {
		// code missing for exception handling 
		System.out.println(e);
		
	}
	
	return null;
}
@PutMapping("/update")
public ResponseEntity<DeliveryAgent> updateDeliveryAgent(@RequestBody DeliveryAgent deliveryAgent) throws Exception
{
	DeliveryAgent savedDeliveryAgent =  deliveryAgentService.addDeliveryAgent(deliveryAgent);
	return new ResponseEntity<DeliveryAgent>(savedDeliveryAgent,HttpStatus.CREATED);
	
}
@DeleteMapping("/userId/{searchUserId}")
public void deleteDeliveryAgentByUserId(@PathVariable int searchUserId) 
{
	try {
		deliveryAgentService.deleteDeliveryAgentByUserId(searchUserId);
		
	  }catch(Exception e){
		  e.printStackTrace();
	  }

}
@GetMapping("/date/{searchDate}")
public DeliveryAgent getDeliveryAgentByDeliveryAgentDate(@PathVariable String searchDate)throws Exception
{
	return deliveryAgentService.getDeliveryAgentByDate(searchDate);
}
@GetMapping("/userId/{searchUserId}")
public List<DeliveryAgent> getDeliveryAgentByUserId(@PathVariable int searchUserId)throws Exception
{
	
	return deliveryAgentService.getDeliveryAgentByUserId(searchUserId);
	
}
@GetMapping("/cost/{searchCost}")
public DeliveryAgent getDeliveryAgentByCost(@PathVariable int searchCost)throws Exception
{
	
	return deliveryAgentService.getDeliveryAgentByCost(searchCost);
	
}
@GetMapping("/productName/{searchProductName}")
public DeliveryAgent getDeliveryAgentByProductName(@PathVariable String searchProductName)throws Exception
{
	
	return deliveryAgentService.getDeliveryAgentByProductName(searchProductName);
	
}
@GetMapping("/deliveryStatus/{searchDeliveryStatus}")
public DeliveryAgent getDeliveryAgentByDeliveryStatus(@PathVariable String searchDeliveryStatus)throws Exception
{
	
	return deliveryAgentService.getDeliveryAgentByDeliveryStatus(searchDeliveryStatus);
	
}
}

