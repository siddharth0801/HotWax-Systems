package Assignment3;

import java.io.Serializable;

public class Employee implements Serializable {
	private String name;
	private String eMail;
	private int age;
	private String DOB;
	
	public Employee(){
		
	}
	
	public Employee(String name, String email, int i, String dob) {
		this.name = name;
		this.eMail=email;
		age=i;
		DOB=dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	
}
