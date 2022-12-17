package com.project.OFH.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.OFH.entity.Review;
import com.project.OFH.service.ReviewService;

@RestController
public class MyWebController {

	@Autowired
	ReviewService rs;
	
	@PostMapping("/save")
	Review saveReview(@RequestBody Review r)
	{
		return rs.createReview(r);
	}
	
	
	@GetMapping("/get")
	List<Review> getReviews()
	{
		return rs.getReviews();
	}
	
	
	@PutMapping("/update")
	Review updateReview(@RequestBody Review review)
	{
		return rs.updateReview(review);
	}
	
	@DeleteMapping("/delete/{username}")
	Review deleteReview(@PathVariable String username)
	{
		return rs.deleteReview(username);
	}
	
	@GetMapping("/filterName/{username}")
	Review filterReview(@PathVariable String username)
	{
		return rs.filterReview(username);
	}
	
	@GetMapping("/filter/{date}")
	List<Review> filterByDate(@PathVariable String date)
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate dat = LocalDate.parse(date, formatter);
		
		return rs.filterByDate(dat);
	}
	
	@GetMapping("/sort")
	List<Review> sortReview()
	{
		return rs.sortReview();
	}
}
