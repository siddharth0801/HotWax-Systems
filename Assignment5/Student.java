
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {

	private String firstName;
	private Date dob;
	private Address a;
	public Student(String name,String dob,Address a) {
		this.setFirstName(name);
		setDate(dob);
		this.setA(a);
	}
	private void setDate(String dob) {
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			this.setDob(date1);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	
}
