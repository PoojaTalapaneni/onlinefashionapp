package com.fashion.gtest.Repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fashion.gtest.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>,CustomProductRepository{
	
	//no code at all

	
	
}