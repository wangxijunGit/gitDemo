package com.icss.dl.atm2;

public class SavingAccount extends Account{

	public SavingAccount(long id, String password, String name, String personId, String email, double balance) {
		super(id,password, name, personId, email, balance);
	}
	 
	public SavingAccount(long id, String password, String name, String personId, String email) {
		super(password, name, personId, email);
		
	}

}
