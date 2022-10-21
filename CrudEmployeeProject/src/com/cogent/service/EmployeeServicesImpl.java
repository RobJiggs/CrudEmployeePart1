/**
 * 
 */
package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;

import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 29, 2022
 */
public class EmployeeServicesImpl implements EmployeeServices {
	
	EmployeeRepo EmployeeRepo=new EmployeeRepoImpl();
	
	@Override
	public void addEmployee(EmployeeBean EmployeeBean) {
		// TODO Auto-generated method stub
			EmployeeRepo.addEmployee(EmployeeBean);
	}

	@Override
	public List<EmployeeBean> viewAllEmployee() {
		// TODO Auto-generated method stub
		
		return EmployeeRepo.viewAllEmployee();
	}

	@Override
	public EmployeeBean FindemployeebyId(int empid) {
		// TODO Auto-generated method stub
		return EmployeeRepo.FindemployeebyId(empid);
	}

	@Override
	public void DeleteEmployee(int empid) {
		// TODO Auto-generated method stub
		EmployeeRepo.DeleteEmployee(empid);

	}

	@Override
	public EmployeeBean FindtheyoungestEmployee() {
		// TODO Auto-generated method stub
		return EmployeeRepo.FindtheyoungestEmployee();
	}

	@Override
	public List<EmployeeBean> EmplooyesFrom(String empCountry) {
		// TODO Auto-generated method stub
		return EmployeeRepo.EmplooyesFrom(empCountry);
	}

	@Override
	public List<EmployeeBean> EmplooyesFrom(String empCountry, String empCity) {
		// TODO Auto-generated method stub
		return EmployeeRepo.EmplooyesFrom(empCountry, empCity);
	}

}
