
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {

	String firstName;
	Date dob;
	Address a;
	public Student(String name,String dob,Address a) {
		this.firstName=name;
		this.dob=dob;
		this.a=a;
	}
	
	
}
