package com.finance.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.mapping.CardDetails;
import com.finance.mapping.RetQuery;
import com.finance.mapping.UserDetails;
import com.finance.model.ProductHistory;
import com.finance.repository.CardRepository;
import com.finance.repository.FinanceRepository;
import com.finance.repository.UserRepository;
@Service
@Transactional
public class FinanceServiceImpl implements FinanceService {
    @Autowired
    FinanceRepository finRep;
    @Autowired
    UserRepository usRep;
    @Autowired
    CardRepository cRep;
	@Override
	public List<ProductHistory> getProducts(int regid) {
		return finRep.findByRegid(regid);
	}
	@Override
	public List<UserDetails> getAllDetails() {
		
		return usRep.findAll();
	}
	@Override
	public UserDetails getDetailsByRegId(long regid) {
		
		return usRep.findById(regid).get();
	}
	@Override
	public String addDetails(UserDetails userDet) {
		 usRep.save(userDet);
		return "Added";
	}
	@Override
	public CardDetails getCardDetailsByRegId(long regid) {
		// TODO Auto-generated method stub
		return cRep.findById(regid).get();
	}

}
