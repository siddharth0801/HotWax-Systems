
import java.io.Serializable;

public class Address implements Serializable {

	private String city;
	private String State;
	private Integer pinCode;
	private String country;
	public Address(String city,String state,Integer pincode,String country){
		this.setCity(city);
		this.setState(state);
		this.setPinCode(pincode);
		this.setCountry(country);
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
