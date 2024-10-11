package edu.wit.cs.comp1000;
import java.util.Scanner;


/**
 * Solution to the PA2a programming assignment.
 * When it runs it asks the user for 5 numbers
 * and then outputs the sum and average of the positive
 * and negative numbers and the sum and of all the numbers.
 * 
 * @author Finn Schoenberger
 */
public class PA2a {

	/**
	 * Starts the program and asks the user for
	 * 5 numbers, outputting different solutions.
	 * 
	 * @param args command-line arguments, ignored
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[5];
		
		System.out.printf("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) {
			numbers[i] = input.nextDouble();
		}
		
		int posNum = 0;
		double posSum = 0;
		for (int i = 0; i < 5; i++) {
			if (numbers[i] >= 1) {
				posSum += numbers[i];
				posNum += 1;
			}
		}
		
		if (posNum == 1) {
			System.out.printf("The sum of the %d positive number: %.0f%n", posNum, posSum);
		} else {
			System.out.printf("The sum of the %d positive numbers: %.0f%n", posNum, posSum);
		}

		
		int negNum = 0;
		double negSum = 0;
		for (int i = 0; i < 5; i++) {
			if (numbers[i] <= 0) {
				negSum += numbers[i];
				negNum += 1;
			}
		}
		
		if (negNum == 1) {
			System.out.printf("The sum of the %d non-positive number: %.0f%n", negNum, negSum);
		} else {
			System.out.printf("The sum of the %d non-positive numbers: %.0f%n", negNum, negSum);
		}

		double sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += numbers[i];
		}
		System.out.printf("The sum of the 5 numbers: %.0f%n", sum);
		
		double posAverage = 0;
		if (posNum == 0) {
			posAverage = 0.00;
		} else {
			posAverage = posSum / posNum;
		}
		
		if (posNum == 1) {
			System.out.printf("The average of the %d positive number: %.2f%n", posNum, posAverage);
		} else {
			System.out.printf("The average of the %d positive numbers: %.2f%n", posNum, posAverage);
		}

		
		double negAverage = 0;
		if (negNum == 0) {
			negAverage = 0.00;
		} else {
			negAverage = negSum / negNum;
		}
		
		if (negNum == 1) {
			System.out.printf("The average of the %d non-positive number: %.2f%n", negNum, negAverage);
		} else {
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", negNum, negAverage);
		}

		
		double average = sum / 5;
		System.out.printf("The average of the 5 numbers: %.2f%n", average);
		
		input.close();
		
	}

}
