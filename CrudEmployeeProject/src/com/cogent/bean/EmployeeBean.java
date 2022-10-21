/**
 * 
 */
package com.cogent.bean;

/**
 * @author Robert Joasilus
 *
 * @date: Sep 28, 2022
 */
public class EmployeeBean {
	private long employeeId;
	private String employeeFname;
	private String employeeLname;
	private String employeeEmail;
	private int employeeAge; 
	private boolean employeeIsMarried;
	private String employeeCity;
	private String employeeCountry;
	/**
	 * @param employeeId
	 * @param employeeFname
	 * @param employeeLname
	 * @param employeeEmail
	 * @param employeeAge
	 * @param employeeIsMarried
	 * @param employeeCity
	 * @param employeeCountry
	 */
	public EmployeeBean(long employeeId, String employeeFname, String employeeLname, String employeeEmail,
			int employeeAge, boolean employeeIsMarried, String employeeCity, String employeeCountry) {
		super();
		this.employeeId = employeeId;
		this.employeeFname = employeeFname;
		this.employeeLname = employeeLname;
		this.employeeEmail = employeeEmail;
		this.employeeAge = employeeAge;
		this.employeeIsMarried = employeeIsMarried;
		this.employeeCity = employeeCity;
		this.employeeCountry = employeeCountry;
	}
	/**
	 * 
	 */
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the employeeId
	 */
	public long getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the employeeFname
	 */
	public String getEmployeeFname() {
		return employeeFname;
	}
	/**
	 * @param employeeFname the employeeFname to set
	 */
	public void setEmployeeFname(String employeeFname) {
		this.employeeFname = employeeFname;
	}
	/**
	 * @return the employeeLname
	 */
	public String getEmployeeLname() {
		return employeeLname;
	}
	/**
	 * @param employeeLname the employeeLname to set
	 */
	public void setEmployeeLname(String employeeLname) {
		this.employeeLname = employeeLname;
	}
	/**
	 * @return the employeeEmail
	 */
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	/**
	 * @param employeeEmail the employeeEmail to set
	 */
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	/**
	 * @return the employeeAge
	 */
	public int getEmployeeAge() {
		return employeeAge;
	}
	/**
	 * @param employeeAge the employeeAge to set
	 */
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	/**
	 * @return the employeeIsMarried
	 */
	public boolean isEmployeeIsMarried() {
		return employeeIsMarried;
	}
	/**
	 * @param employeeIsMarried the employeeIsMarried to set
	 */
	public void setEmployeeIsMarried(boolean employeeIsMarried) {
		this.employeeIsMarried = employeeIsMarried;
	}
	/**
	 * @return the employeeCity
	 */
	public String getEmployeeCity() {
		return employeeCity;
	}
	/**
	 * @param employeeCity the employeeCity to set
	 */
	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}
	/**
	 * @return the employeeCountry
	 */
	public String getEmployeeCountry() {
		return employeeCountry;
	}
	/**
	 * @param employeeCountry the employeeCountry to set
	 */
	public void setEmployeeCountry(String employeeCountry) {
		this.employeeCountry = employeeCountry;
	}
	public String display() {
		return String.valueOf(employeeId)+ " " + String.valueOf(employeeFname) + " " + 
	String.valueOf(employeeLname) + " " + 
				String.valueOf( employeeEmail) + " " + String.valueOf(employeeAge) + " "
				+ String.valueOf(employeeIsMarried) + " " + String.valueOf(employeeCity)+ "," + String.valueOf(employeeCountry)
                           ;	
	}
	

}
