package com.finance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.Model.CardDetails;
import com.finance.Repository.CardDetailsRepository;
@Service
@Transactional
public class CardDetailsServiceImpl implements CardDetailsService {
	@Autowired
	CardDetailsRepository cardRepo;

	@Override
	public boolean updateBalance(int regid,int price) {
		// TODO Auto-generated method stub
		CardDetails card=cardRepo.findByRegid(regid);
		int bal=card.getAvailbal()-price;
		card.setAvailbal(bal);
		cardRepo.save(card);

return true;
	}

	@Override
	public List<CardDetails> getProducts() {
		// TODO Auto-generated method stub
		return cardRepo.findAll();
	}

	
}
