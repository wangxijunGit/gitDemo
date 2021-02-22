package com.icss.dl.atm2;

public class Account {
	private long id = 1000000000;// id
	private String password;// 密码
	private String name;// 姓名
	private String personId;// 身份证号
	private String email;// 邮箱
	private double balance;// 余额

	public Account() {
		super();
		id++;
	}

	public Account(String password, String name, String personId, String email) {
		super();
		id++;
		this.password = password;
		this.name = name;
		this.personId = personId;
		this.email = email;
	}

	public Account(long id,String password, String name, String personId, String email) {
		super();
		this.id= id;
		this.password = password;
		this.name = name;
		this.personId = personId;
		this.email = email;
	}
	
	public Account(long id,String password, String name, String personId, String email,Double balance) {
		super();
		this.id= id;
		this.password = password;
		this.name = name;
		this.personId = personId;
		this.email = email;
		this.balance = balance;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 存款方法
	public Account deposit(double money) {
		if (money > 0) {
			this.balance += money;
		}
		return this;
	}

	// 取款方法
	public Account withdraw(double money) {
		if (money > 0 && this.balance >= money) {
			this.balance -= money;
		}
		else {
			System.out.println("余额不足");
		}
		return this;
	}

	public String toString() {
		return "Account [id=" + id + ", 密码=" + password + ", 姓名=" + name + ", 身份证号=" + personId + ", email=" + email + ", 余额="
				+ balance + "]";
	}
}
