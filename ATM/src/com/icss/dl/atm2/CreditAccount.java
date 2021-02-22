package com.icss.dl.atm2;

public class CreditAccount extends Account{
	private double ceiling;

	public CreditAccount() {
		super();
	}

	public CreditAccount(double ceiling) {
		super();
		this.ceiling = ceiling;
	}

	public double getCeiling() {
		return ceiling;
	}

	public void setCeiling(double ceiling) {
		this.ceiling = ceiling;
	}
	
	public Account register(){
		
		return this;
	}
}
