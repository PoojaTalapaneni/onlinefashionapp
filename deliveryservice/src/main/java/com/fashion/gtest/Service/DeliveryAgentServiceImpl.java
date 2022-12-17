package com.fashion.gtest.Service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashion.gtest.Entity.DeliveryAgent;
import com.fashion.gtest.Repository.DeliveryAgentRepository;

@Service
public class DeliveryAgentServiceImpl implements DeliveryAgentService {
@Autowired
DeliveryAgentRepository deliveryAgentRepository;

	@Override
	public DeliveryAgent addDeliveryAgent(DeliveryAgent deliveryAgent) throws Exception {
		DeliveryAgent savedDeliveryAgent=deliveryAgentRepository.save(deliveryAgent);
		return savedDeliveryAgent;

	}


	@Override
	public DeliveryAgent updateDeliveryAgent(DeliveryAgent deliveryAgent) throws Exception {
		DeliveryAgent savedDeliveryAgent=deliveryAgentRepository.save(updateDeliveryAgent(deliveryAgent));
		return savedDeliveryAgent;
	}


	@Override
	public DeliveryAgent getDeliveryAgentByDate(String Date) throws Exception {
		DeliveryAgent deliveryAgent= deliveryAgentRepository.getDeliveryAgentByDate(Date);
		 
		 if(deliveryAgent==null) 
		 {
			 throw new EntityNotFoundException(Date+"not listed in the database");
		 }else 
		 {
		   return deliveryAgent;
		 }
	}
	

	@Override
	public DeliveryAgent getDeliveryAgentByCost(int Cost) throws Exception {
		DeliveryAgent deliveryAgent = deliveryAgentRepository.getDeliveryAgentByCost(Cost);
		 return deliveryAgent;
	}

	@Override
	public void deleteDeliveryAgentByUserId(int userId) {
		deliveryAgentRepository.deleteById(userId);
		
	}

	@Override
	public List<DeliveryAgent> getDeliveryAgentByUserId(int userId) throws Exception {
		System.out.println("------>>Inside service Impl id"+userId);
		return deliveryAgentRepository.getDeliveryAgentByUserId(userId);
		
	}


	@Override
	public List<DeliveryAgent> getAllDeliveryAgents() throws Exception {
		List<DeliveryAgent>allDeliveryAgents=deliveryAgentRepository.findAll();
		return allDeliveryAgents;
		
	}


	@Override
	public DeliveryAgent getDeliveryAgentByProductName(String ProductName) throws Exception {
		DeliveryAgent deliveryAgent = deliveryAgentRepository.getDeliveryAgentByProductName(ProductName);
		 return deliveryAgent;
		
	}


	@Override
	public DeliveryAgent getDeliveryAgentByDeliveryStatus(String DeliveryStatus) throws Exception {
		DeliveryAgent deliveryAgent = deliveryAgentRepository.getDeliveryAgentByDeliveryStatus(DeliveryStatus);
		 return deliveryAgent;
	}
	
}
