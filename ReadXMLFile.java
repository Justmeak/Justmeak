package org.test;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadXMLFile {

	public static void main(String[] args) throws JAXBException {
		readXML();
	}

	private static void readXML() throws JAXBException {
		JAXBContext con = JAXBContext.newInstance(Employee.class);

		Unmarshaller un = con.createUnmarshaller();

		File f = new File("C:\\Users\\Dell\\eclipse-workspace\\APITesting\\src\\test\\resources\\XML\\Employeee.xml");
		Object obj = un.unmarshal(f);

		empDetails ed = (empDetails) obj;

		Employee e1=ed.getEmployee1();
		
		System.out.println("Employee id is"+e1.getEmpID());
		System.out.println("Ëmployee name is "+e1.getEmpName());
		System.out.println("Employee phno is "+e1.getEmpPhno());
		
		Address a=(Address)obj;
		
		System.out.println("Street"+a.getStreet());
		System.out.println("City"+a.getCity());
		System.out.println("State"+a.getState());

	}

}
