package com.fashion.gtest.Repository;
import java.util.List;

import com.fashion.gtest.entity.Product;

public interface CustomProductRepository {
	
	public List<Product> getProductBybrandName(String brandName);
	public List<Product> getProductByCategory(String category);
	public List<Product> getProductByCost(int cost);
			

}