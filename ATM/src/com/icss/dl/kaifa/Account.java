package com.icss.dl.kaifa;

public class Account {
	private long id;
	private String passd;
	private String name;
	private String personId;
	private String email;
	public double balance=3000;
	
	public Account() {
		super();
	}

	public Account(long id, String passd, String name, String personId, String email, double balance) {
		super();
		this.id = id;
		this.passd = passd;
		this.name = name;
		this.personId = personId;
		this.email = email;
		this.balance =balance;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPassd() {
		return passd;
	}

	public void setPassd(String passd) {
		this.passd = passd;
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
	
	public Account deposit(double money){
		if(money>0){
		System.out.println("存款成功");	
		this.balance+=money;
		}else{
			System.out.println("存款金额错误");
		}
		
		return this;
	}
	
	public Account withdraw(double money){
		
		if (balance>money) {
			System.out.println("取款成功");
		this.balance-=money;
		}else{
			System.out.println("金额不足");
		}
		return this;
	}
	public Account showInfo(){
		System.out.println("个人信息如下");
		System.out.println("默认额度为3000");
		System.out.println("账号  "+id+"密码  "+passd+"姓名  "+name+"身份证号  "+personId+"邮箱  "+email+"余额  "+balance);
		return this;
	}

}
