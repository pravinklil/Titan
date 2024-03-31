package com.xoxoday.Interface;

import java.util.Scanner;

public class B implements I {
	
	String empusername;
	double empsal;

	@Override
	public void input() {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the User Name");
	empusername = sc.nextLine();
	
	System.out.println("Enter the Employee Salary");
	empsal = sc.nextDouble();
	

	}

	@Override
	public void output() {
		System.out.println(empusername + "    " +empsal);
				

	}

}
