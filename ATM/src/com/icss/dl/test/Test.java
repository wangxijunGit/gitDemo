package com.icss.dl.test;

import java.util.Scanner;

import com.icss.dl.kaifa.Account;
public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Account ac=new Account();
		String answer="0";
		
		System.out.println("请输入账号");
		long id=input.nextLong();
		ac.setId(id);
		System.out.println("请输入密码");
		String passd=input.next();
		ac.setPassd(passd);
		
		System.out.println("请输入姓名");
		String name=input.next();
		ac.setName(name);
		
		System.out.println("请输入身份证号");
		String personId=input.next();
		ac.setPersonId(personId);
		
		System.out.println("请输入邮箱");
		String email=input.next();
		ac.setEmail(email);
		
		do{
		System.out.println("请选择业务 1.存款 2.取款 3.查询");
		switch (input.nextInt()) {
		case 1:
			
			do{
			System.out.println("请输入存款数");
			double money=input.nextDouble();
			
				
			ac.deposit(money);
			
			System.out.println("你账户的余额为\t"+ac.balance+"元");
			
			System.out.println("是否继续存款（y/n）");
			answer=input.next();
			}while(answer.equals("y"));
			System.out.println("结束存款");
			break;
		case 2:
			do{
			System.out.println("请输入取款数");
			double money=input.nextDouble();
			
			ac.withdraw(money);
			
			System.out.println("你的账户余额为"+ac.balance);
			
			System.out.println("是否继续（y/n）");
			answer=input.next();
			}while(answer.equals("y"));
			System.out.println("结束取款");
			break;
		case 3:
			ac.showInfo();
			break;

		default:
			System.out.println("暂无该服务");
			break;
		}
		System.out.println("是否继续操作（y/n）");
		answer=input.next();
		}while(answer.equals("y"));
		System.out.println("系统退出");
	}
}

