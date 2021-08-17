
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;  

public class SortingByDOB implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(o1.getDOB());
			Date date2=new SimpleDateFormat("dd/MM/yyyy").parse(o2.getDOB());
			return date1.compareTo(date2);
		} catch (ParseException e) {
			System.out.println(e);
		}
		return 0;
		
		
	}
	

}
