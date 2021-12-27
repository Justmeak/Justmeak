package org.test;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Employee {
	
	private int empID;
	private String empName;
	private long empPhno;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpPhno() {
		return empPhno;
	}
	public void setEmpPhno(long empPhno) {
		this.empPhno = empPhno;
	}

}
