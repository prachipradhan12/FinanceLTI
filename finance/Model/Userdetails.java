package com.finance.Model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class Userdetails {
	
	//@OneToOne(mappedBy = "regid", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	//@OneToOne(cascade = CascadeType.ALL)
	@Id
	private int regid;
	private String uname;
	private long phone;
	private String email;
	private String upass;
	private String address;
	private String cardtype;
	private String bankname;
	private long acc_no;
	private String ifsc_code;
	private LocalDate applied_on; 
	private String isverified;
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="card_fk")
	//private Carddetails cardDetails;

	
//	public Carddetails getCardDetails() {
//		return cardDetails;
//	}
//	public void setCardDetails(Carddetails cardDetails) {
//		this.cardDetails = cardDetails;
//	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public LocalDate getApplied_on() {
		return applied_on;
	}
	public void setApplied_on(LocalDate applied_on) {
		this.applied_on = applied_on;
	}
	public String getIsverified() {
		return isverified;
	}
	public void setIsverified(String isverified) {
		this.isverified = isverified;
	}
	public Userdetails(int regid, String uname, int phone, String email, String upass, String address, String cardtype,
			String bankname, long acc_no, String ifsc_code, LocalDate applied_on, String isverified) {
		super();
		this.regid = regid;
		this.uname = uname;
		this.phone = phone;
		this.email = email;
		this.upass = upass;
		this.address = address;
		this.cardtype = cardtype;
		this.bankname = bankname;
		this.acc_no = acc_no;
		this.ifsc_code = ifsc_code;
		this.applied_on = applied_on;
		this.isverified = isverified;
	}
	public Userdetails() {
		super();
		
	}
//public Userdetails(int regid, String uname, long phone, String email, String upass, String address, String cardtype,
//		String bankname, long acc_no, String ifsc_code, LocalDate applied_on, String isverified,
//		Carddetails cardDetails) {
//	super();
//	this.regid = regid;
//	this.uname = uname;
//	this.phone = phone;
//	this.email = email;
//	this.upass = upass;
//	this.address = address;
//	this.cardtype = cardtype;
//	this.bankname = bankname;
//	this.acc_no = acc_no;
//	this.ifsc_code = ifsc_code;
//	this.applied_on = applied_on;
//	this.isverified = isverified;
//	this.cardDetails = cardDetails;
//}
	
	

}




