
import java.util.ArrayList;

public class DeserializationTest {

	public static void main(String[] args) {
		Problem5 pr5 = new Problem5();
		String filename="output1.ser";
		System.out.println(filename+" reading!!");
		ArrayList<Student> data = pr5.DeserializingList(filename);
		for(Student s: data) {
			System.out.print(s.firstName+" "+s.dob);
			System.out.println(" "+s.a.city+" "+s.a.State+" "+s.a.pinCode+" "+s.a.country);
			
		}

	}

}
