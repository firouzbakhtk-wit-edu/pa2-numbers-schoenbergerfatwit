package edu.wit.cs.comp1000;
import java.util.Scanner;

/**
 * Solution to the PA2b programming assignment.
 * When it runs it asks the user for 3 numbers a,
 * b, and c and then takes the discriminant and 
 * outputs the root(s).
 * 
 * @author Finn Schoenberger
 */
public class PA2b {

	/**
	 * Starts the program and asks the user for
	 * 3 numbers, outputting their roots from the
	 * discriminant.
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		System.out.printf("Enter a b c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		double discriminant = (b*b) - 4*(a*c);
		
		if (discriminant < 0) {
			System.out.printf("Roots: imaginary%n");
		} else if (discriminant == 0) {
			double root = ((-1*b)/(2*a));
			System.out.printf("Root: %.2f%n", root);
		} else if (discriminant > 0) {
			double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots: %.2f, %.2f%n", Math.min(root1, root2), Math.max(root1, root2));
		}
		
		
	}

}
