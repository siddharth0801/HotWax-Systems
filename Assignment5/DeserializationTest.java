
import java.util.ArrayList;

public class DeserializationTest {

	public static void main(String[] args) {
		Problem5 pr5 = new Problem5();
		String filename="output2.ser";
		ArrayList<Student> data = pr5.deserializingList(filename);
		for(Student s: data) {
			System.out.print(s.firstName+" "+s.dob);
			System.out.println(" "+s.a.getCity()+" "+s.a.getState()+" "+s.a.getPinCode()+" "+s.a.getCountry());
			
		}

	}

}
