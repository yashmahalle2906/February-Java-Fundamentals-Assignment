//Write a program to add 3 to the ASCII value of the any character user provides and print the equivalent
//character.
package JavaFundamentals;

import java.util.Scanner;

public class AscciValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st character :");
		char a = sc.next().charAt(0);
		System.out.println("Enter 2nd character :");
		char b = sc.next().charAt(0);
		System.out.println("Enter 3rd character :");
		char c = sc.next().charAt(0);
		
		int sum;
		sum=a+b+c;
		System.out.println("ASCII Value of three character after sum is  "+sum);
		System.out.println("Equivalent value for sum of ASCII value  " +(char)sum);
		 

				
				
			
	}

}
