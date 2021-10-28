package com.sourkul.service;

import com.sourkul.exception.CartItemException;
import com.sourkul.exception.UserException;
import com.sourkul.modal.Cart;
import com.sourkul.modal.CartItem;
import com.sourkul.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
