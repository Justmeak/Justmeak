package org.test;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class empDetails {

	private Employee employee1;

	public Employee getEmployee1() {
		return employee1;
	}

	public void setEmployee1(Employee employee1) {
		this.employee1 = employee1;
	}
	
}
