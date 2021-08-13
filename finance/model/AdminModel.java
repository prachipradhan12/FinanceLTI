//package com.finance.model;
//
//import java.time.LocalDate;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="admindetails")
//public class AdminModel {
//	@Id
//	private long adminid;
//	private String adminName;
//	private String password;
//	public String getAdminName() {
//		return adminName;
//	}
//	
//	
//	public AdminModel() {
//		super();
//	}
//
//
//	public AdminModel(long adminid, String adminName, String password) {
//		super();
//		this.adminid = adminid;
//		this.adminName = adminName;
//		this.password = password;
//	}
//
//
//	public void setAdminName(String adminName) {
//		this.adminName = adminName;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//}