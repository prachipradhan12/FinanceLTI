package com.fianance.service;

import java.util.List;

import com.fianance.model.User;

public interface UserService {
	public boolean addUser(User user);
	public User findUserByUname(String uname);
	public List<User> getAllUsers();
}
