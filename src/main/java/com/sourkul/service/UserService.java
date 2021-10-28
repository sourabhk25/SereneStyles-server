package com.sourkul.service;

import com.sourkul.exception.UserException;
import com.sourkul.modal.User;

public interface UserService {
	
	public User findUserById(Long userId) throws UserException;
	
	public User findUserProfileByJwt(String jwt) throws UserException;

}
