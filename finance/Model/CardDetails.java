package com.finance.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "Carddetails")
@DynamicUpdate
public class CardDetails {
	@Id
	@Column(name="cardno")
	private int cardno;
	@Column(name="regid")
	private int regid;
	@Column(name="cardtype")
	private String cardtype;
	@Column(name="validity")
	private Date validity;
	@Column(name="initialbal")
	private int initialbal;
	@Column(name="availbal")
	private int availbal;
	public int getCardno() {
		return cardno;
	}
	public void setCardno(int cardno) {
		this.cardno = cardno;
	}
	public int getRegid() {
		return regid;
	}
	public void setRegid(int regid) {
		this.regid = regid;
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
	public CardDetails() {
		super();
	}
	
	

}
