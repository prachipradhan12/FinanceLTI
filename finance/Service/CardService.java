package com.finance.Service;

import java.util.List;

import com.finance.Model.Carddetails;
import com.finance.Model.Userdetails;


public interface CardService {
	public List<Carddetails> getCarddetails();
	
	
		public boolean updateCard(int regid);
		
		public Carddetails findCard(int regid);
		public boolean deleteCard(int regid);
		
		public boolean addCard(Carddetails card);
	

}






