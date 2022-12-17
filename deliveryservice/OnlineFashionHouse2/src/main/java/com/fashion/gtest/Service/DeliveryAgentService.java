package com.fashion.gtest.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fashion.gtest.Entity.DeliveryAgent;
@Service

public interface DeliveryAgentService {
	
	public DeliveryAgent addDeliveryAgent(DeliveryAgent deliveryAgent)throws Exception;
	
	public List<DeliveryAgent> getAllDeliveryAgents() throws Exception;
	
	public DeliveryAgent updateDeliveryAgent (DeliveryAgent deliveryAgent ) throws Exception;
	
	public void deleteDeliveryAgentByUserId(int userId);
	 
	
	
	public DeliveryAgent  getDeliveryAgentByDate(String Date)throws Exception;
	
	public DeliveryAgent  getDeliveryAgentByCost(int Cost)throws Exception;
	
	public List<DeliveryAgent> getDeliveryAgentByUserId(int userId)throws Exception;
	
public DeliveryAgent getDeliveryAgentByProductName(String ProductName)throws Exception;

public DeliveryAgent getDeliveryAgentByDeliveryStatus(String DeliveryStatus)throws Exception;

}
