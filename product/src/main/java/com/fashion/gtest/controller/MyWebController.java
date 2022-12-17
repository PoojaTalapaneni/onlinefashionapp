package com.fashion.gtest.controller;
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

import com.fashion.gtest.entity.Product;
import com.fashion.gtest.service.ProductService;

@RestController
@RequestMapping("myproduct")
public class MyWebController {
	
	@Autowired
	ProductService productService;
	
	public  MyWebController(){ 
		System.out.println("Product Controller constructor called");
		
	}
	@GetMapping("/getAll")
	public List<Product> getAllProduct() {
		return productService.getAllProduct();
	}

	@GetMapping("/getProductBybrandName/{brandName}")
	public List<Product> getUsersByRole(@PathVariable String brandName) throws Exception {
		try {
			System.out.println(brandName);
			return productService.getProductBybrandName(brandName);
		} catch (Exception e) {
			throw new Exception("Product unknown");
		}
	}

	// CREATE
	@PostMapping("/add")
	public Product addUser(@RequestBody Product product) throws Exception {
		
		try {
			product = productService.addProduct(product);
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return product;
	}
	// UPDATE
	@PutMapping("/updateUser")
	public ResponseEntity<Product> updateQuestion(@RequestBody Product p) throws Exception {
		Product update = productService.updateProduct(p);
		try {
			return new ResponseEntity<Product>(update, HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception("Invalid Movement");
		}

	}
	
	@GetMapping("/filterproductName/{productName}")
    public List<Product> filterProduct(@PathVariable String productName)throws Exception{
    	List<Product> allfiltered=productService.filterByproductName(productName);
		return allfiltered;
    }
	public void deleteProductById(@PathVariable int searchId) 
	{
		try {
			productService.deleteProductById(searchId);
			
		  }catch(Exception e){
			  e.printStackTrace();
		  }
	
	}
}