package com.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.mapping.CardDetails;
import com.finance.mapping.RetQuery;
import com.finance.mapping.UserDetails;
import com.finance.model.ProductHistory;
import com.finance.repository.CardRepository;
import com.finance.repository.UserRepository;
import com.finance.service.FinanceService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("financeRest/api")
public class FinanceController {
	 @Autowired
	 FinanceService finSer;
	 
	 @Autowired
	 UserRepository usRep;
	 
	 @Autowired
	 CardRepository cdRep;
	 
	  //Details of user transaction history
      @GetMapping("/financeHistory/{regid}")
      public List<ProductHistory> getProducts(@PathVariable(value="regid")int regid){
    	  return finSer.getProducts(regid);
      }
      //Details of User from user table.
      @GetMapping("/details/{regid}")
      public UserDetails getDetails(@PathVariable(value="regid")long regid) {
    	  return finSer.getDetailsByRegId(regid);
      }
    //Just for testing
      @GetMapping("/alldetails")
      public List<UserDetails> getAllDetails() {
    	  return finSer.getAllDetails();
      }
      
      
      //Just for testing
      @PostMapping("/addetails")
      public String addDetails(@RequestBody UserDetails userDet) {
    	 return finSer.addDetails(userDet);
      }
      @GetMapping("/carddetails/{regid}")
      public CardDetails getCardDet(@PathVariable(value="regid")long regid){
    	  return finSer.getCardDetailsByRegId(regid);
      }
      
}
