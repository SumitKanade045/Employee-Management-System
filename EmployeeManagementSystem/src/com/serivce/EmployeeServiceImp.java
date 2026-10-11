package com.serivce;

import java.util.*;
import com.model.*;

public class EmployeeServiceImp implements EmployeeServiceI{

	Scanner sc = new Scanner(System.in);
	
	List<Employee> l1 = new ArrayList<>();
	
	
	
	@Override
	public void addemp(Employee e) {
	
		System.out.println("Enter Employee ID: ");
		e.setEid(sc.nextInt());
		
		System.out.println("Enter Employee Name: ");
		e.setName(sc.next());
		
		System.out.println("Enter Employee Salary: ");
		e.setSalary(sc.nextDouble());
		
		System.out.println("Enter Employee Mobile Number: ");
		e.setmNo(sc.nextLong());
		
		System.out.println("Enter Employee Age: ");
		e.setAge(sc.nextInt());
		
		l1.add(e);
	}

	@Override
	public void viewemp() {
		
		
		Set<Employee> s = null;
		
		System.out.println("Sort Employee Details By\n"+"Enter 1. for Id Wise Shorting\n"+"Enter 2. for Name Wise Shorting\n"+"Enter 3. for Age wise Sorting\n"+"Enter 4. for Mobile Number Wise Sorting\n"+"Enter 5. for Salary Wise Sorting");
		int n = sc.nextInt();
		
		try {
			
		
		switch(n) {
			
		case 1:
			
			s=new TreeSet<>(Comparator.comparingInt(Employee::getEid));
			System.out.println("----------Sort By Employee ID----------");
			break;
			
		case 2:
			
			s=new TreeSet<>(Comparator.comparing(Employee::getName));
			System.out.println("----------Sort By Employee Name----------");

			break;
			
		case 3:
			
			s=new TreeSet<>(Comparator.comparingInt(Employee::getAge));
			System.out.println("----------Sort By Employee Age----------");

			break;
			
		case 4:
			
			s=new TreeSet<>(Comparator.comparingLong(Employee::getmNo));
			System.out.println("----------Sort By Employee Mobile Number----------");

			break;
			
		case 5:
			
			s=new TreeSet<>(Comparator.comparingDouble(Employee::getSalary));
			System.out.println("----------Sort By Employee Salary----------");

			break;
			
		default:
			
			System.out.println("Enter Valid Choise!");
		}
				
		System.out.println("\nEmployee Details are !\n");
		
		s.addAll(l1);
		
		s.forEach(System.out::println);
		
		
		}catch(Exception e) {
			
			System.out.println("Enter Number only.");
		}
	}

	@Override
	public void deleteemp() {
		
		try {
		
		
		System.out.println("Enter 1 for Delete All Employee Details");
		System.out.println("Enter 2 for Delete Specific Employee Details");
		System.out.println("Enter 3 for Exite");
		int a = sc.nextInt();
		
		if(a==1) {
			
			l1.clear();
			System.out.println("All Employee Details Remove Successfully Thank You!");
			
		}else if(a==2) {
			
			System.out.println("Enter Employee Id For Delete Employee.");
			
			int id = sc.nextInt();
			
			boolean removed = l1.removeIf(emp->emp.getEid()==id);
			
			if(removed) {
				
				System.out.println("Employee Deleted Successfully.");
				
			}else {
				
				System.out.println("Employee Id is not found.");
			}
		}
		
		else if(a==3) {
			
			return;
			
		}else {
			
			System.out.println("Invalid Choise.");
		}
		
		}catch(Exception e) {
			
			System.out.println("Enter Number only.");
		}
	}

}
