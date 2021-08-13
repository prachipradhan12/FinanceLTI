package com.finance.mapping;

import java.sql.Date;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="carddet1")
public class CardDetails {
	@Id
	private long regid;
	private long cardno ;
	private String cardtype;
	private Date validity;
	private int initialbal;
	private int availbal;
	public CardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CardDetails(long regid, long cardno, String cardtype, Date validity, int initialbal, int availbal) {
		super();
		this.regid = regid;
		this.cardno = cardno;
		this.cardtype = cardtype;
		this.validity = validity;
		this.initialbal = initialbal;
		this.availbal = availbal;
	}
	public long getRegid() {
		return regid;
	}
	public void setRegid(long regid) {
		this.regid = regid;
	}
	public long getCardno() {
		return cardno;
	}
	public void setCardno(long cardno) {
		this.cardno = cardno;
	}
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public Date getValidity() {
		return validity;
	}
	public void setValidity(Date validity) {
		this.validity = validity;
	}
	public int getInitialbal() {
		return initialbal;
	}
	public void setInitialbal(int initialbal) {
		this.initialbal = initialbal;
	}
	public int getAvailbal() {
		return availbal;
	}
	public void setAvailbal(int availbal) {
		this.availbal = availbal;
	}
	
}
