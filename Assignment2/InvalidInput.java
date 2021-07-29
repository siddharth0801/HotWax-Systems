

/*This Exception class is when user enters invalid input like negative numbers for length, breadth, radius of Shapes.*/
public class InvalidInput extends Exception {
	public InvalidInput(String s) {
		super(s);
	}
}
