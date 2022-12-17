package com.fashion.gtest.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fashion.gtest.entity.Product;

@Service
public interface ProductService {
	
	public List<Product> getAllProduct();
	public void deleteProductById(int id);
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	
	
	public List<Product> filterByproductName(String productName)throws Exception;
		
	public List<Product> sortingBasedOnproductName()throws Exception;
	public List<Product> getProductBybrandName(String brandName);
	public List<Product> getProductByCategory(String category);
	public List<Product> getProductByCost(int cost);

}