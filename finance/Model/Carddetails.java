package com.finance.Model;

import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
	@Table(name="carddetails2")
	public class Carddetails {
//		@Id
//		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
//	    @SequenceGenerator(sequenceName = "cardno_sequence", allocationSize = 1, name = "CUST_SEQ")
//
//		@Column(name="regid")
		@Id
		@Column(name="regid")
		private int regid;
		
		
//			@GenericGenerator(name = "sequence", strategy = "sequence", parameters = {
//		            @org.hibernate.annotations.Parameter(name = "cardno_sequence", value = "sequence"),
//		            @org.hibernate.annotations.Parameter(name = "allocationSize", value = "1"),
//		    })
//		    @GeneratedValue(generator = "sequence", strategy=GenerationType.SEQUENCE)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
	    @SequenceGenerator(sequenceName = "cardno_sequence", allocationSize = 1, name = "CUST_SEQ")

		@Column(name="cardno")
		private long cardno ;
		@Column(name="cardtype")
		private String cardtype;
		@Column(name="validity")
		private Date  validity;
		@Column(name="initialbal")
		private int initialbal;
		@Column(name="availbal")
		private int availbal;
		
		
		
		public Carddetails(int regid, long cardno, String cardtype,Date validity, int initialbal, int availbal) {
			super();
			this.regid = regid;
			this.cardno = cardno;
			this.cardtype = cardtype;
			this.validity = validity;
			this.initialbal = initialbal;
			this.availbal = availbal;
		}
		public int getRegid() {
			return regid;
		}
		public void setRegid(int regid) {
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
		
		public Carddetails() {
			super();
			// TODO Auto-generated constructor stub
		}

}
