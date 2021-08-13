package com.finance.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.finance.model.admindetails;
@Service
@Transactional

public class AdminServiceImpl implements AdminService {

	
	List<admindetails>list;
	public AdminServiceImpl() {
		list=new ArrayList<>();
		list.add(new admindetails(100,"jhon","hdskfhsdh"));
		list.add(new admindetails(200,"BoB","fshfjhsdhf"));
	}
	
	
	@Override
	public List<admindetails> getadmindetails() {
		// TODO Auto-generated method stub
		return list;
	}
}