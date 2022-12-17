package com.project.OFH.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.OFH.entity.Review;
import com.project.OFH.exceptions.DateNotFoundException;
import com.project.OFH.exceptions.ReviewNotFoundException;
import com.project.OFH.repository.ReviewRepository;
import com.project.OFH.service.ReviewService;


@Service
public class ReviewServiceImpl implements ReviewService{

	
	@Autowired
	ReviewRepository r;
	
	@Override
	public Review createReview(Review review) {
		Review rev=r.save(review);
		System.out.println("Created");
		return rev;
	}

	@Override
	public List<Review> getReviews() {
		
		return r.findAll();
	}

	@Override
	public Review updateReview(Review review) {
		
		return r.save(review);
	}

	@Override
	public Review deleteReview(String username) {
		Review rev=r.findByUsername(username);
		if(rev==null)
			throw new ReviewNotFoundException("Review not found with given username");
		r.delete(rev);
		return rev;
	}

	@Override
	public Review filterReview(String username) {
		Review rev=r.findByUsername(username);
		return rev;
	}

	@Override
	public List<Review> filterByDate(LocalDate date) {
		boolean flag=false;
		List<Review> list=r.findAll();
		List<Review> res=new ArrayList<>();
		for(Review x:list)
		{
			if(x.getDate().equals(date))
			{
				flag=true;
				res.add(x);
			}
		}
		if(flag==false)
		{
			throw new DateNotFoundException("Review with given date = "+date+" not found");
		}
		return res;
	}

	@Override
	public List<Review> sortReview() {
		List<Review> list=r.findAll();
		List<Review> res=new ArrayList<>();
		Collections.sort(list, (o1, o2) -> o1.getPoints() - o2.getPoints());
		return list;
	}

}
