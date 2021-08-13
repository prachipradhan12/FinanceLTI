package com.finance.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="prodhis")
public class ProductHistory {
	@Id
    private	int phistoryid;
	private int regid;
	private int prodid;
	private Date purchase_date;
	private int amountpaid ;
	private String EMI ;
	private int ammount_bal;
	public ProductHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductHistory(int phistoryid, int regid, int prodid, Date purchase_date, int amountpaid, String eMI,
			int ammount_bal) {
		super();
		this.phistoryid = phistoryid;
		this.regid = regid;
		this.prodid = prodid;
		this.purchase_date = purchase_date;
		this.amountpaid = amountpaid;
		EMI = eMI;
		this.ammount_bal = ammount_bal;
	}
	public int getPhistoryid() {
		return phistoryid;
	}
	public void setPhistoryid(int phistoryid) {
		this.phistoryid = phistoryid;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public int getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(int amountpaid) {
		this.amountpaid = amountpaid;
	}
	public String getEMI() {
		return EMI;
	}
	public void setEMI(String eMI) {
		EMI = eMI;
	}
	public int getAmmount_bal() {
		return ammount_bal;
	}
	public void setAmmount_bal(int ammount_bal) {
		this.ammount_bal = ammount_bal;
	}
}
