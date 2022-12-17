package com.fashion.gtest.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashion.gtest.Entity.DeliveryAgent;

@Repository
	public interface DeliveryAgentRepository extends JpaRepository<DeliveryAgent,Integer>,DeliveryAgentCustomRepository {

	}

