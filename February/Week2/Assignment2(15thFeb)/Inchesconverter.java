//Write a Java program to take the number input from user in inches and convert it to meters.
//inch = 0.0508 meters
package JavaFundamentals;

import java.util.Scanner;

public class Inchesconverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in inch is :");
		int inch = sc.nextInt();
	
		double metre;

		metre = 0.0508 * inch;
		System.out.println("Inch converted to metre is: " +metre);

	}

}
