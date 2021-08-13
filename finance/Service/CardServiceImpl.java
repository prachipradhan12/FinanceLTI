package com.finance.Service;

import java.sql.Date;
//import java.util.Date;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.Model.Carddetails;
import com.finance.Model.Userdetails;
import com.finance.Repository.CardRepository;



@Service
@Transactional

public class CardServiceImpl implements CardService {
	@Autowired
	CardRepository crdRepo;

	@Override
	public List<Carddetails> getCarddetails() {
		// TODO Auto-generated method stub
		return crdRepo.findAll();
	}

	@Override
	public boolean updateCard(int regid) {
		Carddetails newcrd=crdRepo.findById(regid).get();
		crdRepo.save(newcrd);
		return true;
		
		
	}

	@Override
	public Carddetails findCard(int regid) {
		// TODO Auto-generated method stub
		return crdRepo.findById(regid).get();
	}

	@Override
	public boolean deleteCard(int regid) {
		// TODO Auto-generated method stub
		Carddetails newusr=crdRepo.findById(regid).get();
		crdRepo.delete(newusr);
		return true;
	}

	@Override
	public boolean addCard(Carddetails card) {
//		if(card.getCardtype()=="Gold") {
//			Date d =Date.valueOf(LocalDate.now().plusMonths( 24));
//			card.setValidity(d);
//			
//		}
//		else
//		{
//			Date d =Date.valueOf(LocalDate.now().plusMonths( 36));
//			card.setValidity(d);
//		}
		
		
		Date d =Date.valueOf(LocalDate.now().plusMonths( 24));
		
		
		//Date d=  LocalDate.now()
		//Date date= new Date();
		//Date date = new java.sql.Date(LocalDate.now());
		//Date date =new Date(System.currentTimeMillis());
		//date=date
//		Date date =new Date(System.currentTimeMillis());
//		Calendar cal=Calendar.getInstance();
//		cal.setTime(date);
//		cal.add(Calendar.YEAR, 2);
//		date=(Date) cal.getTime();
//		card.setValidity(date);
//		
	card.setValidity(d);
		
		
		crdRepo.save(card);
		return true;}


}


