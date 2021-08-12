package com.finance.Service;

import java.util.List;

import com.finance.Model.CardDetails;



public interface CardDetailsService {
	public boolean updateBalance(int regid,int price);
	public List<CardDetails> getProducts();
	
}
