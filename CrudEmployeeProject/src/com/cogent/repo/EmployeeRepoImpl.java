/**
 * 
 */
package com.cogent.repo;

import java.util.ArrayList;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */
public class EmployeeRepoImpl implements EmployeeRepo {
	List<EmployeeBean> employs=new ArrayList<>();
	{
	
		employs.add(new EmployeeBean(1,"Robert","Joasilus","rba@gmail.com",27,false,"New Rochelle","US"));
		employs.add(new EmployeeBean(2,"Ro","J","rba@gmail.com",22,false,"Yonkers","NZ"));
		employs.add(new EmployeeBean(3,"Rob","Jay","rba@gmail.com",40,true,"Mount Vernon","AUS"));
		employs.add(new EmployeeBean(4,"Quintin","James","rba@gmail.com",18,false,"Mount Vernon","AUS"));
		
		
	}
	
	@Override
	public void addEmployee(EmployeeBean EmployeeBean) {
		// TODO Auto-generated method stub
		employs.add(EmployeeBean);

	}

	@Override
	public List<EmployeeBean> viewAllEmployee() {
		// TODO Auto-generated method stub
		
		return employs;
	}

	@Override
	public EmployeeBean FindemployeebyId(int empid) {
		// TODO Auto-generated method stub
		EmployeeBean employBean=null;
		for (EmployeeBean employeeBean : employs) {
			employBean=employeeBean;
			if(employBean.getEmployeeId()==empid) {
				System.out.println("This Employee is in the Database");
				return employBean;
				
				
				
			}
			
		}return null;
	}

	@Override
	public void DeleteEmployee(int empid) {
		// TODO Auto-generated method stub
		EmployeeBean Employee=null;
		for (EmployeeBean EmployeeBean : employs) {
			
			Employee=EmployeeBean;
			if (Employee.getEmployeeId()==empid) {
				System.out.println("Employee is found in repo");
				employs.remove(Employee);
				System.out.println("Employee is deleted");
				return;
			}

	}
	}

	@Override
	public EmployeeBean FindtheyoungestEmployee() {
		// TODO Auto-generated method stub
		EmployeeBean Employee=null;
		for(int i=0;i<employs.size();i++) {
			for(int j=i;j>0;j--) {
				EmployeeBean Bean1 =employs.get(j-1);
				EmployeeBean Bean2 =employs.get(j);
				if(Bean1.getEmployeeAge()>Bean2.getEmployeeAge()) {
					
					Employee=Bean1;
					employs.set(j-1, Bean2);
					employs.set(j, Employee);
					
					
				}
				
				
				
				
				
			}
			
			
			
			
		} System.out.println("Youngest Employee found");
		return employs.get(0);
		
		
		
		
		
	}

	@Override
	public List<EmployeeBean> EmplooyesFrom(String empCountry) {
		// TODO Auto-generated method stub
		List<EmployeeBean> employees=new ArrayList<>();
		for (EmployeeBean employeeBean : employs) {
			if(employeeBean.getEmployeeCountry().equals(empCountry)) {
				
				employees.add(employeeBean);
				
				
			}
		}
		
		
		return employees;
	}

	@Override
	public List<EmployeeBean> EmplooyesFrom(String empCountry, String empCity) {
		// TODO Auto-generated method stub
		List<EmployeeBean> employees=new ArrayList<>();
		for (EmployeeBean employeeBean : employs) {
			if(employeeBean.getEmployeeCountry().equals(empCountry) && employeeBean.getEmployeeCity().equals(empCity)) {
				
				employees.add(employeeBean);
				
				
			}
		}
		System.out.println("Employees from"+ ","+ (String) empCity + "," + empCountry);
		
		return employees;
	}
}
