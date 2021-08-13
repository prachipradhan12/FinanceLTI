package com.finance.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.Service.AdminService;
import com.finance.model.admindetails;

	@RestController
//	@CrossOrigin(origins="http://localhost:4200")
//	@RequestMapping("/admindetailsRest/api")

	public class AdminController {
		@Autowired
		 AdminService adminservice; 
		//@Autowired
		//AdminService adService;
		@GetMapping("/admindetails")
		public List<admindetails> getAll(){
			return this.adminservice.getadmindetails();
		} 

	}

