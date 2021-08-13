package com.finance.mapping;

import java.sql.Date;

public class RetQuery {
	public String uname;
	public long cardno;
	public Date validity;
	public String cardtype;
	public RetQuery(String uname, long cardno, Date validity, String cardtype) {
		
		this.uname = uname;
		this.cardno = cardno;
		this.validity = validity;
		this.cardtype = cardtype;
	}

	
}
