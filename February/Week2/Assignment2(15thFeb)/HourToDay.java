//Write a Java program to take the number input from user in hours and convert it into a number of days and years
//1 hour - 0.0416667 day
package JavaFundamentals;

import java.util.Scanner;

public class HourToDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hour :");
		int hour = sc.nextInt();
		double day;
		day = 0.041667 * hour;
		System.out.println("Hour converted to day is : " + day);

	}

}
