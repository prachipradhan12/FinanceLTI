package com.finance.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.Model.Userdetails;
import com.finance.Repository.AdminRepository;




@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminRepository adRepo;

	@Override
	public List<Userdetails> getUserdetails() {
		
		return adRepo.findAll();
	}

//	@Override
//	public boolean updateUser(int regid) {
//		
//		Userdetails newusr=adRepo.findById(regid).get();
////		newusr=user;
//	String verify="true";
//	newusr.setIsverified(verify);
//		adRepo.save(newusr);
//		// TODO Auto-generated method stub
//		return true;
//	}

	@Override
	public Userdetails findUser(int regid) {
		// TODO Auto-generated method stub
		return adRepo.findById(regid).get();
	}

//	@Override
//	public boolean deleteUser(Userdetails user) {
//		adRepo.delete(user);
//		// TODO Auto-generated method stub
//		return true;
//	}
//	

//	@Override
//	public boolean deleteProduct(Userdetails user) {
//        adRepo.delete(user);
//		
//		return true;
//	}
	@Override
	public boolean deleteUser( int regid) {
		Userdetails newusr=adRepo.findById(regid).get();
		//newusr=user;
	//String verify="true";
	//newusr.setIsverified(verify);
		//adRepo.save(newusr);
	adRepo.delete(newusr);
		// TODO Auto-generated method stub
		return true;
		
		

}
	@Override
	public boolean updateUser(int regid) {
		
		Userdetails newusr=adRepo.findById(regid).get();
//		newusr=user;
	String verify="true";
	newusr.setIsverified(verify);
		adRepo.save(newusr);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean addUser(Userdetails user) {
		adRepo.save(user);
		return true;
	}

	

}





