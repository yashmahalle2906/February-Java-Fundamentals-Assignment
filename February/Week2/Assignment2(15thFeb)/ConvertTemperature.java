//Write a Java program to convert temperature from Fahrenheit to Celsius degree
package JavaFundamentals;

import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value in fahrenheit ");
		float fahrenheit = sc.nextFloat();
		
		float  degreeCelsius;
		
		degreeCelsius= (fahrenheit - 32) * 5/9;
		System.out.println("Converted from fahrenheit to degreeCelsius is "+degreeCelsius);

	}

}
