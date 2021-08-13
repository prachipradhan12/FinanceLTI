package com.finance.service;

import java.util.List;

import com.finance.mapping.RetQuery;
import com.finance.mapping.UserDetails;
import com.finance.model.ProductHistory;

public interface FinanceService {

	public List<ProductHistory> getProducts(int regid);
	public List<UserDetails> getAllDetails();
	public UserDetails getDetailsById(long regid);
	public String addDetails(UserDetails userDet);
	    
}
