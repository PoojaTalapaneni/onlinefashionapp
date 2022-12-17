package com.fashion.gtest.comparator;

import java.util.Comparator;

import com.fashion.gtest.entity.Product;

public class SortingBasedOnProductNameHighToLow implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o2.getProductName().compareTo(o1.getProductName());
		
	}

}
