
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Problem5 {
	
	public ArrayList<Student> makeList() {
		ArrayList<Student> arr = new ArrayList<>();
		
		Address a1 = new Address("Indore", "MP", 450001, "India");
		Student s1 = new Student("Siddharth", "04/03/2000", a1);
		arr.add(s1);
		Address a2 = new Address("Bhopal", "MP", 462001, "India");
		Student s2 = new Student("Kushagra", "24/07/1999", a2);
		arr.add(s2);
		Address a3 = new Address("Delhi", "Delhi", 120001, "India");
		Student s3 = new Student("Aditya", "07/11/1998", a3);
		arr.add(s3);
		Address a4 = new Address("Agra", "UP", 110451, "India");
		Student s4 = new Student("Ajay", "25/01/1999", a4);
		arr.add(s4);
		return arr;
	}
	public void SerializationProcess(String filename) {
		ArrayList<Student> arr = makeList();
		SerializingList(arr, filename);
	}
	private void SerializingList(ArrayList<Student> data,String filename) {
		
		try {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(data);
			oos.close();
			fos.close();
			System.out.println(filename+" Created!!");
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public ArrayList<Student> DeserializingList(String filename) {
		ArrayList<Student> data =null;
		try {
			FileInputStream fis = new FileInputStream(filename);
			ObjectInputStream ois = new ObjectInputStream(fis);
			data = (ArrayList<Student>) ois.readObject();
			
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		return data;
	}
	
}
