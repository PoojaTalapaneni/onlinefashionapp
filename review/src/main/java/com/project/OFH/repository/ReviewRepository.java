package com.project.OFH.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.OFH.entity.*;

public interface ReviewRepository extends JpaRepository<Review,String>{
Review findByUsername(String username);	
	}



