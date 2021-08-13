

import java.util.Scanner;

public class Problem2 {
Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("\tMain Menu");
		System.out.println("Select your prefered Shape:");
		System.out.println("1) Circle");
		System.out.println("2) Rectangle");
		System.out.println("3) Triangle");
		System.out.println("4) Square");
		System.out.println("5) Sphere");
		System.out.println("6) Cylinder");
		System.out.println("7) Cube");
		System.out.println("8) Cuboid");
		System.out.print("Your choice number-> ");
		byte shapenumber = sc.nextByte();
		try {
			inputPara(shapenumber);
		} catch (InvalidInputException e) {
			System.out.println("InvalidInputException Exception: "+e.getMessage()+"\n");
			
		}
		
	}
	private void inputPara(byte shape) throws InvalidInputException {
		switch (shape) {
        case 1:
            circle();
            break;
        case 2:
            rectangle();
            break;
        case 3:
            triangle();
            break;
        case 4:
            square();
            break;
        case 5:
            sphere();
            break;
        case 6:
            cylinder();
            break;
        case 7:
            cube();
            break;
        case 8:
            cuboid();
            break;
        default:
        	System.out.println("Invalid input, Enter from the given numbers");
            
        }
	}
	private void cuboid() throws InvalidInputException {
		
		System.out.println("Cuboid:");
		System.out.print("Enter length(l): ");
		double l = sc.nextDouble();
		if(l<0) {
			throw new InvalidInputException("Negative Length");
		}
		System.out.print("Enter breath(b): ");
		double b = sc.nextDouble();
		if(b<0) {
			throw new InvalidInputException("Negative Breadth");
		}
		System.out.print("Enter height(h): ");
		double h = sc.nextDouble();
		if(h<0) {
			throw new InvalidInputException("Negative Height");
		}
		double TSArea = 2*(l*b+b*h+h*l);
		double Volume = l*b*h;
		System.out.println("SurfaceArea of Cuboid with length and breadth and height "+l+", "+b+", "+h+" is: "+String.format("%.2f", TSArea));
		System.out.println("Volume of Cuboid with length and breadth and height "+l+", "+b+", "+h+" is: "+String.format("%.2f", Volume));
		System.out.println();
	}
	private void cube() throws InvalidInputException {
		
		System.out.println("Cube:");
		System.out.print("Enter Side(s): ");
		double a = sc.nextDouble();
		if(a<0) {
			throw new InvalidInputException("Negative Side");
		}
		double SurfaceArea = 6*Math.pow(a, 2);
		double Volume = Math.pow(a, 3);
		System.out.println("SurfaceArea of Cube with Side "+a+" is: "+String.format("%.2f", SurfaceArea));
		System.out.println("Volume of Cube with Side "+a+" is: "+String.format("%.2f", Volume));
		System.out.println();
	}
	private void cylinder() throws InvalidInputException {
		
		double pi = Math.PI;
		System.out.println("Cylinder:");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		if(radius<0) {
			throw new InvalidInputException("Negative Radius");
		}
		System.out.print("Enter height: ");
		double height = sc.nextDouble();
		if(height<0) {
			throw new InvalidInputException("Negative Height");
		}
		double CSArea = 2*pi*radius*height;
		double SArea = 2*pi*radius*(radius+height);
		double Volume = pi*Math.pow(radius, 2)*height;
		System.out.println("Curved Surface area of Cylinder with radius and height "+radius+", "+height+" is: "+String.format("%.2f", CSArea));
		System.out.println("Total Surface Area of Cylinder with radius and height "+radius+", "+height+" is: "+String.format("%.2f", SArea));
		System.out.println("Volume of Cylinder with radius and height "+radius+", "+height+" is: "+String.format("%.2f", Volume));
		System.out.println();
	}
	private void sphere() throws InvalidInputException {
		
		double pi = Math.PI;
		System.out.println("Sphere:");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		if(radius<0) {
			throw new InvalidInputException("Negative Radius");
		}
		double SArea = 4*pi*Math.pow(radius, 2);
		double Volume = (4.0/3.0)*pi*Math.pow(radius, 3);
		System.out.println("Surface Area of Sphere with radius "+radius+" is: "+String.format("%.2f", SArea));
		System.out.println("Volume of Sphere with radius "+radius+" is: "+String.format("%.2f", Volume));
		System.out.println();
	}
	private void square() throws InvalidInputException {
		
		System.out.println("Square:");
		System.out.print("Enter Side(s): ");
		double s = sc.nextDouble();
		if(s<0) {
			throw new InvalidInputException("Negative Side");
		}
		double Area = Math.pow(s, 2);
		double Perimeter = 4*s;
		System.out.println("Perimeter of Square with Side "+s+" is: "+String.format("%.2f", Perimeter));
		System.out.println("Area of Square with Side "+s+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void triangle() throws InvalidInputException {
		
		System.out.println("Triangle:");
		System.out.print("Enter height(h): ");
		double h = sc.nextDouble();
		if(h<0) {
			throw new InvalidInputException("Negative Height");
		}
		System.out.print("Enter base(b): ");
		double b = sc.nextDouble();
		if(b<0) {
			throw new InvalidInputException("Negative Base");
		}
		double Area = 0.5*h*b;
		System.out.println("Area of Triangle with height and base "+h+", "+b+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void rectangle() throws InvalidInputException {
		
		System.out.println("Rectangle:");
		System.out.print("Enter length(l): ");
		double l = sc.nextDouble();
		if(l<0) {
			throw new InvalidInputException("Negative Length");
		}
		System.out.print("Enter breath(b): ");
		double b = sc.nextDouble();
		if(b<0) {
			throw new InvalidInputException("Negative Breadth");
		}
		double Area = l*b;
		double Perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle with length and breadth "+l+", "+b+" is: "+String.format("%.2f", Perimeter));
		System.out.println("Area of Rectangle with length and breadth "+l+", "+b+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void circle() throws InvalidInputException {
		double pi = Math.PI;
		System.out.println("Cirlce:");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		if(radius<0) {
			throw new InvalidInputException("Negative Radius");
		}
		double Area = pi*Math.pow(radius, 2);
		double Circumference = 2*pi*radius;
		System.out.println("Circumference of Circle with radius "+radius+" is: "+String.format("%.2f", Circumference));
		System.out.println("Area of Circle with radius "+radius+" is: "+String.format("%.2f", Area));
		System.out.println();
		
	}
}
