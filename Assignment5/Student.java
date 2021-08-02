
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {

	String firstName;
	// String dob;
	Date dob;
	Address a;
	public Student(String name,String dob,Address a) {
		this.firstName=name;
		// this.dob=dob;
		SetDate(dob);
		this.a=a;
	}
	private void SetDate(String dob) {
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
			this.dob=date1;
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	
}
