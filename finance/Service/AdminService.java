package com.finance.Service;

import java.util.List;

import com.finance.Model.Userdetails;





public interface AdminService {
	public List<Userdetails> getUserdetails();
//public boolean updateUser(Userdetails user);
	public boolean updateUser(int regid);
	
	public Userdetails findUser(int regid);
	public boolean deleteUser(int regid);
	//public boolean deleteUser(Userdetails user);
	public boolean addUser(Userdetails user);
}
