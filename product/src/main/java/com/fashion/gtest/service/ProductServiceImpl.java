package com.fashion.gtest.service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashion.gtest.Repository.ProductRepository;
import com.fashion.gtest.comparator.SortingBasedOnProductNameHighToLow;
import com.fashion.gtest.entity.Product;


@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public void deleteProductById(int id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Product addProduct(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		Product update = productRepository.save(product);
		return update;
	}

	@Override
	public List<Product> getProductBybrandName(String brandName) {
		
		return productRepository.getProductBybrandName(brandName);
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		
		return productRepository.getProductByCategory(category);
	}

	@Override
	public List<Product> getProductByCost(int cost) {
		// TODO Auto-generated method stub
		return productRepository.getProductByCost(cost);
	}

	@Override
	public List<Product> filterByproductName(String productName) throws Exception {
		// TODO Auto-generated method stub
		List<Product> allfilterdproductName=getAllProduct().stream().filter((product)->product.getProductName().equals(productName)).collect(Collectors.toList());
		return allfilterdproductName;
		
	}

	@Override
	public List<Product> sortingBasedOnproductName() throws Exception {
		// TODO Auto-generated method stub
		List<Product> list=productRepository.findAll();
		List<Product> product=new ArrayList<>();
		Collections.sort(list,new SortingBasedOnProductNameHighToLow());
		return list;
	}
    

	
    
}