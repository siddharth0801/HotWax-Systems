
import java.io.Serializable;

public class Address implements Serializable {

	String city;
	String State;
	Integer pinCode;
	String country;
	public Address(String city,String state,Integer pincode,String country){
		this.city=city;
		this.State=state;
		this.pinCode=pincode;
		this.country=country;
		
	}
	
}
