
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Problem3 {
	
	private HashMap<String,Employee> empList = new HashMap<>();
	private Scanner sc = new Scanner(System.in);
	public void InitializeHash() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Employee.txt"));
			String values = br.readLine();
			String[] all = values.split(";");
			for(String x : all) {
				String[] data = x.split(",");
				Employee emp = new Employee(data[1], data[2], Integer.parseInt(data[3]), data[4]);
				empList.put(getEmpID(emp), emp);
			}
			br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}
	public void ConsoleMenu() {
		
		System.out.println("\n\tMenu");
		System.out.println("1) Add Employee ");
		System.out.println("2) Delete Employee ");
		System.out.println("3) Search Employee ");
//		System.out.println("4) Print Employees ");
		System.out.print("Your Choice Number-> ");
		byte choice = sc.nextByte();
		sc.nextLine();
		Operations(choice);
	}
	public void Operations(byte b) {
		
		switch (b) {
		case 1:
			AddOp();
			break;
		case 2:
			DeleteOp();
			break;
		case 3:
			SearchOp();
			break;
//		case 4:
//			PrintallEmp();
//			break;
		default:
			System.out.println("Ivalid Choice!!");
			break;
		}
	}
	private void SearchOp() {
		
		System.out.print("Enter Query(to Search in data): ");
		String que = sc.nextLine();
		ArrayList<Employee> arr = new ArrayList<Employee>();
		for (Entry<String, Employee> entry : empList.entrySet()) {
			Employee e = entry.getValue();
			String data = e.getName()+" "+e.geteMail()+" "+e.getAge()+" "+e.getDOB();
			if(data.toUpperCase().contains(que.toUpperCase())) {
				arr.add(e);
			}
//			System.out.println(e.getName()+" "+e.geteMail()+" "+e.getAge()+" "+e.getDOB());
		}
		if(arr.isEmpty()) {
			System.out.println("Record not Found Try again!!");
			return;
		}
		System.out.println("Sort(Order By)?? ");
		System.out.println("1) Name, 2) Age, 3) DOB ");
		byte sortingchoice=sc.nextByte();
		if(sortingchoice==1) {
			Collections.sort(arr,new Sortingbyname());
		}
		else if(sortingchoice==2) {
			Collections.sort(arr,new Sortingbyage());
		}
		else if(sortingchoice==3) {
			Collections.sort(arr,new SortingbyDOB());
		}
		else {
			System.out.println("Invalid Choice!! Try Again");
			return;
		}
		System.out.println("Direction (ascending or descending)?? ");
		System.out.println("1) ascending, 2) descending ");
		byte dirchoice = sc.nextByte();
		if(dirchoice==1) {
			for(Employee e1: arr) {
				System.out.println(e1.getName()+" "+e1.geteMail()+" "+e1.getAge()+" "+e1.getDOB());
				
			}
		}
		else if(dirchoice==2) {
			Collections.reverse(arr);
			for(Employee e1: arr) {
				System.out.println(e1.getName()+" "+e1.geteMail()+" "+e1.getAge()+" "+e1.getDOB());
				
			}
		}
		else {
			System.out.println("Invalid Choice!! Try Again!!");
		}
		
	}
	private void DeleteOp() {
		System.out.println("Deleting Employee Record!!");
		System.out.println("Enter Employee ID");
		String id = sc.nextLine();
		if(empList.containsKey(id)) {
			System.out.println("Record Found!!");
			empList.remove(id);
			File f = new File("Employee.txt");
			f.delete();
			for (Entry<String, Employee> entry : empList.entrySet()) {
				Employee e = entry.getValue();
				Addtofile(e);
			}
			
		}
		
	}
	public void PrintallEmp() {
		
		for (Entry<String, Employee> entry : empList.entrySet()) {
			Employee e = entry.getValue();
			System.out.println(e.getName()+", "+e.geteMail()+", "+e.getAge()+", "+e.getDOB());
		}
		
	}
	private String getEmpID(Employee e) {
		String s = e.getName();
		s=s.substring(0, 3);
		String date = e.getDOB();
		String[] d = date.split("/");
		return (s+d[0]+d[1]+d[2]);
	}
	private void AddOp() {
		
		System.out.println("Adding Employee!!");
		System.out.print("Enter Name: ");
		String name = sc.nextLine();
		
		System.out.print("Enter Email: ");
		String mail = sc.nextLine();
		System.out.print("Enter Age: ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter DOB: ");
		String dob = sc.nextLine();
		
		Employee emp = new Employee(name, mail, age, dob);
		empList.put(getEmpID(emp), emp);
		Addtofile(emp);
		System.out.println("Employee Added!!");
	}
	public void Addtofile(Employee e) {
		
		try {
			
			BufferedWriter br = new BufferedWriter(new FileWriter("Employee.txt",true));
			if(new File("Employee.txt").length()==0) {
				br.write(getEmpID(e)+",");
			}
			else {
				br.write(";"+getEmpID(e)+",");
			}
					
			br.write(""+e.getName()+",");
			br.write(""+e.geteMail()+",");
			br.write(""+e.getAge()+",");
			br.write(""+e.getDOB());
			br.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
}
