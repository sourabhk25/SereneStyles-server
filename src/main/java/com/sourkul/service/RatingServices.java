package com.sourkul.service;

import java.util.List;

import com.sourkul.exception.ProductException;
import com.sourkul.modal.Rating;
import com.sourkul.modal.User;
import com.sourkul.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
