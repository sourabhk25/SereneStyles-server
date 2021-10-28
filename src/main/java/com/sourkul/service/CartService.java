package com.sourkul.service;

import com.sourkul.exception.ProductException;
import com.sourkul.modal.Cart;
import com.sourkul.modal.User;
import com.sourkul.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
