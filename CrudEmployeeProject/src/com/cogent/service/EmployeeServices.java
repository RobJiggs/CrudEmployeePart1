/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */
public interface EmployeeServices {
	 public void addEmployee(EmployeeBean bookBean);
	 public List<EmployeeBean> viewAllEmployee();
	 public EmployeeBean FindemployeebyId(int empid);
	 public void DeleteEmployee(int empid);
	 public EmployeeBean FindtheyoungestEmployee();
	 public  List<EmployeeBean> EmplooyesFrom(String empCountry);
	 public  List<EmployeeBean> EmplooyesFrom(String empCountry,String empCity);
}