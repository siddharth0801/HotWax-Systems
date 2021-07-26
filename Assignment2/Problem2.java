

import java.util.Scanner;

public class Problem2 {
Scanner sc = new Scanner(System.in);
	
	public void Menu() {
		System.out.println("Main Menu");
		System.out.println("Select your prefered Shape:");
		System.out.println("1) Circle");
		System.out.println("2) Rectangle");
		System.out.println("3) Triangle");
		System.out.println("4) Square");
		System.out.println("5) Sphere");
		System.out.println("6) Cylinder");
		System.out.println("7) Cube");
		System.out.println("8) Cuboid");
		System.out.print("Your choice-> ");
		byte shapenumber = sc.nextByte();
		Inputpara(shapenumber);
		
	}
	private void Inputpara(byte shape) {
		switch (shape) {
        case 1:
            Circle();
            break;
        case 2:
            Rectangle();
            break;
        case 3:
            Triangle();
            break;
        case 4:
            Square();
            break;
        case 5:
            Sphere();
            break;
        case 6:
            Cylinder();
            break;
        case 7:
            Cube();
            break;
        case 8:
            Cuboid();
            break;
        
            
        }
	}
	private void Cuboid() {
		
		
	}
	private void Cube() {
		
		System.out.println("Cube:");
		System.out.print("Enter Side(s): ");
		double a = sc.nextDouble();
		double SurfaceArea = 6*Math.pow(a, 2);
		double Volume = Math.pow(a, 3);
		System.out.println("SurfaceArea of Cube with Side "+a+" is: "+String.format("%.2f", SurfaceArea));
		System.out.println("Volume of Cube with Side "+a+" is: "+String.format("%.2f", Volume));
		System.out.println();
	}
	private void Cylinder() {
		
		
	}
	private void Sphere() {
		
		
	}
	private void Square() {
		
		System.out.println("Square:");
		System.out.print("Enter Side(s): ");
		double s = sc.nextDouble();
		double Area = Math.pow(s, 2);
		double Perimeter = 4*s;
		System.out.println("Perimeter of Square with Side "+s+" is: "+String.format("%.2f", Perimeter));
		System.out.println("Area of Square with Side "+s+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void Triangle() {
		
		System.out.println("Triangle:");
		System.out.print("Enter height(h): ");
		double h = sc.nextDouble();
		System.out.print("Enter base(b): ");
		double b = sc.nextDouble();
		double Area = 0.5*h*b;
		System.out.println("Area of Triangle with height and base "+h+", "+b+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void Rectangle() {
		
		System.out.println("Rectangle:");
		System.out.print("Enter length(l): ");
		double l = sc.nextDouble();
		System.out.print("Enter breath(b): ");
		double b = sc.nextDouble();
		double Area = l*b;
		double Perimeter = 2*(l+b);
		System.out.println("Perimeter of Rectangle with length and breadth "+l+", "+b+" is: "+String.format("%.2f", Perimeter));
		System.out.println("Area of Rectangle with length and breadth "+l+", "+b+" is: "+String.format("%.2f", Area));
		System.out.println();
	}
	private void Circle() {
		double pi = Math.PI;
		System.out.println("Cirlce:");
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double Area = pi*Math.pow(radius, 2);
		double  Circumference = 2*pi*radius;
		System.out.println("Circumference of Circle with radius "+radius+" is: "+String.format("%.2f", Circumference));
		System.out.println("Area of Circle with radius "+radius+" is: "+String.format("%.2f", Area));
		System.out.println();
		
	}
}
