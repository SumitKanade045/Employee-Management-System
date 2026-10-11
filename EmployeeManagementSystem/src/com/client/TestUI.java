package com.client;

import java.util.Scanner;
import com.serivce.*;
import com.model.Employee;

public class TestUI {
	
	public static void main(String[] args) {
		
		EmployeeServiceI e = new EmployeeServiceImp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n---------------Employee Mangement System---------------\n");
		
		try {
			
		
		while(true) {
			
		System.out.println("----------Menu----------");
		System.out.println("Enter 1 for Add Employee");
		System.out.println("Enter 2 for View Employee Details");
		System.out.println("Enter 3 for Delete Employee");
		System.out.println("Enter 4 for Exite");
		
		System.out.println("\nEnter Your Choise.....\n");
		
		int n = sc.nextInt();
		
		switch(n) {
		
		case 1: 
			
			Employee e1 =new Employee();
			e.addemp(e1);
			break;
			
		case 2:
			
			e.viewemp();
			break;
			
		case 3:
			
			e.deleteemp();
			break;
			
		case 4:
		    System.out.println("Thank You...");
		    System.exit(0);	
		    break;
		    
		    
		default:
			
			System.out.println("Enter Valid Number");
		}

		}
		
		}catch(Exception e2) {
			
			System.out.println("Enter Valid Data In Specified Data Formate Thank You!");
			
		}
	}

}
