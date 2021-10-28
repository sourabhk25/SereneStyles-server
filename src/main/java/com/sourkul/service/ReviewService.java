package com.sourkul.service;

import java.util.List;

import com.sourkul.exception.ProductException;
import com.sourkul.modal.Review;
import com.sourkul.modal.User;
import com.sourkul.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
