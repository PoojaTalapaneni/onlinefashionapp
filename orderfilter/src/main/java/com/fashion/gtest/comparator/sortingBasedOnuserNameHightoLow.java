package com.fashion.gtest.comparator;

import java.util.Comparator;

import com.fashion.gtest.entity.Order;

public class sortingBasedOnuserNameHightoLow implements Comparator<Order> {

	@Override
	public int compare(Order o1, Order o2) {

		return o2.getUserName().compareTo(o1.getUserName());
	}

}