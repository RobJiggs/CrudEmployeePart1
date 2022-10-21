/**
 * 
 */
package com.cogent.client;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.exceptions.AgeOutofBoundsException;
import com.cogent.repo.EmployeeRepoImpl;

import com.cogent.service.EmployeeServices;
import com.cogent.service.EmployeeServicesImpl;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */
public class EmployeeLibrary {
	public static void main(String[] args) throws AgeOutofBoundsException {
		EmployeeServices employeeService=new EmployeeServicesImpl();
;		Scanner scanner=new Scanner(System.in);
		int option=0;
		boolean valid;
		while(true) {
			System.out.println("**************************");
			
			System.out.println("Menu");
			System.out.println("**************************");
			System.out.println("1.Add Employee");
			System.out.println("2.Find Employee by Id");
			System.out.println("3.Display All employess");
			
			System.out.println("4.Delete Employee by Id");
			System.out.println("5. Find Youngest Employee");
			System.out.println("6.Display all Employees from County");
			System.out.println("7.Display all Employees from City and County");
			System.out.println("8. Exit");
			
		
		
		
			
			
			
			
			
			do {
				valid=true;
				System.out.println("Select an option");
				try {
				
					
					option=scanner.nextInt();
				
			
					
					
			}catch(InputMismatchException Ime) {
				System.out.println("Invalid selection try again ");
				scanner.next();
				valid=false;
				
				
			}
				
				
			}while(!valid);
			
			switch(option) {
			case 1:    
					
				EmployeeBean employeeBean= new EmployeeBean();
				
				do {
					valid=true;
					System.out.println("Enter employee id");
					try {
					
						
					
						int i=scanner.nextInt();
						employeeBean.setEmployeeId(i);
				
						
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter employee id again ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				
				do {
					valid=true;
					System.out.println("Enter employee First name");
					try {
					
						
						
						String i=scanner.next()+ scanner.nextLine();
						employeeBean.setEmployeeFname(i);
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter employee First name again ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				
				
				
				do {
					valid=true;
					System.out.println("Enter employee Last name");
					try {
					
						
						
						
						String i=scanner.next()+ scanner.nextLine();
						employeeBean.setEmployeeLname(i);
						
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter employee Last name again ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				
				
				do {
					valid=true;
					System.out.println("Enter employee Email ");
					try {
					
						
					
						
						
						String i=scanner.next()+ scanner.nextLine();
						employeeBean.setEmployeeEmail(i);
						
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter employee Email again ");
					scanner.next();
					valid=false;
					
					
				}
					//scanner.next();
					
				}while(!valid);
				
				do {
					valid=true;
					System.out.println("Enter employee Age ");
					
					try {
					
						
						
						
						
						
						int age=scanner.nextInt();
						if(age<0 || age>123) {
							throw new AgeOutofBoundsException("that age is impossible");
							
							
						}
						employeeBean.setEmployeeAge(age);
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter employee age again ");
					scanner.next();
					valid=false;
					
					
				}catch(AgeOutofBoundsException aobe) {
					
					System.out.println("that age is impossible,try again");
					scanner.nextLine();
					valid=false;
					
				}
					
					
				}while(!valid);
				
				
				do {
					valid=true;
					System.out.println("Is the employee Married, true or false ");
					try {
					
						
						
						
						
						
						boolean i=scanner.nextBoolean();
						employeeBean.setEmployeeIsMarried(i);
						
				}catch(InputMismatchException Ime) {
					System.out.println("Is the employee Married, please type true or false ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				

				do {
					valid=true;
					System.out.println("Enter the employee City ");
					try {
					
						
						
						
						
						
						
						String i=scanner.next()+ scanner.nextLine();
						employeeBean.setEmployeeCity(i);
						
						
				}catch(InputMismatchException Ime) {
					System.out.println("Enter the employee City,again ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				
			
			
				
				do {
					valid=true;
					System.out.println("Enter the employee Country ");
					try {
					
						
						
						
						
						
						
						String i=scanner.next()+ scanner.nextLine();
						employeeBean.setEmployeeCountry(i);
					
				}catch(InputMismatchException Ime) {
					System.out.println("Enter the employee Country,again ");
					scanner.next();
					valid=false;
					
					
				}
					
					
				}while(!valid);
				
				employeeService.addEmployee(employeeBean);
				break;
				
			
			
					
					
					
					
				
			case 3: 
					List<EmployeeBean> all_employees=null;
					all_employees=employeeService.viewAllEmployee();
					for (EmployeeBean employeeBean3 : all_employees) {
						System.out.println(	employeeBean3.display());
					
					
			
					
					
					
					
				}
					break;
			case 2: 
					System.out.println("Please enter Employee Id");
					int employeeId=scanner.nextInt();
					EmployeeBean employee=employeeService.FindemployeebyId(employeeId);
					if(employee!=null) {
						System.out.println(employee.display());
						
					}
					else {
						System.out.println("Employee Not in system");
						
						
					}
					break;
					
					
					
					
					
				
			case 4: 
					
					System.out.println("Please Enter employee Id");
					int empId= scanner.nextInt();
					employeeService.DeleteEmployee(empId);
					break;
					
					
				
			case 5:
					EmployeeBean employeeBean5= new EmployeeBean();
					employeeBean5=employeeService.FindtheyoungestEmployee();
					System.out.println(employeeBean5.display());
					break;
					
					
					
					
				
			case 6:
					System.out.println("What Country are they from");
					String empCountry= scanner.next()+scanner.nextLine();
					
					
					List<EmployeeBean> employees=new ArrayList<>();
					employees=employeeService.EmplooyesFrom(empCountry);
							
					if(!employees.isEmpty()) {
						for (EmployeeBean employeeBean6 : employees) {
							System.out.println(employeeBean6.display());
							
						}
						
					}
					
					
					
					else {
						System.out.println("There are no employees from this country");
						
						
						
					
						
					}
					break;
					
				
			case 7:
					System.out.println("What Country are they from");
					String empCountry2= scanner.next()+ scanner.nextLine();
					
					System.out.println("What City are they from");
					String empCity= scanner.next()+scanner.nextLine();
					System.out.println(empCity);
					
					List<EmployeeBean> employees7=new ArrayList<>();
					employees=employeeService.EmplooyesFrom(empCountry2,empCity);
							
					if(!employees.isEmpty()) {
						for (EmployeeBean employeeBean2 : employees) {
							System.out.println(employeeBean2.display());
							
						}
						
					}
					else {
						System.out.println("There are no employees from this country and city");
						
						
					}
					
					
					break;
					
					
			default:
				System.exit(0);
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		}
				
			}
		}
	
	
