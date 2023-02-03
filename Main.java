import java.util.Scanner;

public class Main {
	public static final double PI = 3.14;
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
						
		System.out.print("Enter a number: ");
		double radius = input.nextDouble();
		
		double c = circumference(radius);
		double v = volume(radius);
		
		System.out.print("Circumference: " + c);
		System.out.println();
		System.out.println("Volume: " +  v);
		
	
		input.close();
	}
	
	public static double circumference(double radius) {
		return 2.0 * (PI * radius);
	}
	public static double volume(double radius) {
		return ( 4.0 * PI) * (radius * radius * radius) / 3;
	}
	
	}


