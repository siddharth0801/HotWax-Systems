

/*This Exception class is when user enters invalid input like negative numbers for length, breadth, radius of Shapes.*/
public class InvalidInputException extends Exception {
	public InvalidInputException(String s) {
		super(s);
	}
}
