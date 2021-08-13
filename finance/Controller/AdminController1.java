package com.finance.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.Model.Carddetails;
import com.finance.Model.Userdetails;
//import com.finance.Model.Carddetails;
import com.finance.Service.AdminService;
//import com.finance.Service.CardService;
import com.finance.Service.CardService;







@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/UserDetailsRest/api")

public class AdminController1 {

	@Autowired
	AdminService adService;
	@Autowired
CardService cdService;
	@GetMapping("/userDetails")
	public List<Userdetails> getAll(){
		return adService.getUserdetails();
	}
	@GetMapping("/userDetails/{regid}")
	public Userdetails getUserById(@PathVariable(value = "regid") int regid) {
		return adService.findUser(regid);
		
	}
	@PostMapping("/userDetails")
	public boolean addUser(@RequestBody Userdetails user) {
	return adService.addUser(user);
	}
	
	@PutMapping("/userDetails/{regid}")
	public boolean updateuserById(@PathVariable(value="regid") int regid) {
		return adService.updateUser(regid);
	}
	@DeleteMapping("/userDetails/{regid}")
	public boolean deleteUser(@PathVariable(value="regid") int regid) {
		return adService.deleteUser(regid);
		//return prodService.deleteProduct(product);
	}
	@DeleteMapping("/userDetails")
	public boolean deleteUser(@RequestBody Userdetails user, int regid) {
		return adService.deleteUser(regid);
	}
	@GetMapping("/cardDetails")
	public List<Carddetails> getAllCards(){
		return cdService.getCarddetails();
	}
	@GetMapping("/cardDetails/{regid}")
	public Carddetails getCardById(@PathVariable(value = "regid") int regid) {
		return cdService.findCard(regid);
		
	}
	@PostMapping("/cardDetails")
	public boolean addCard(@RequestBody Carddetails card) {
		
	return cdService.addCard(card);
	}
	
	@PutMapping("/cardDetails/{regid}")
	public boolean updatecardById(@PathVariable(value="regid") int regid) {
		return cdService.updateCard(regid);
	}
	@DeleteMapping("/cardDetails/{regid}")
public boolean deleteCard(@PathVariable(value="regid") int regid) {
	return cdService.deleteCard(regid);
	//return prodService.deleteProduct(product);
	}
	
	
}
	
//	@DeleteMapping("/userDetails")
//	public boolean deleteUser(@RequestBody Userdetails user) {
//		return adService.deleteUser(user);
//	}
//	@GetMapping("/userDetails/{regid}/{isverified}")
//	public Userdetails getUserById(@PathVariable(value = "regid", value="isverified") int regid, String isverified) {
//		return adService.findUser(regid);
//		
//	}
	
//	@DeleteMapping(path = { "/{regid}" })
//	public Userdetails delete(@PathVariable("regid") int regid) {
//		Userdetails deletedUser = null;
//		for (Userdetails usr : user) {
//			
//			if (usr.getRegid()== regid) {
//				user.remove(usr);
//				deletedUser = usr;
//				break;
//			}
//		}
//		return deletedUser;
//	}

//}