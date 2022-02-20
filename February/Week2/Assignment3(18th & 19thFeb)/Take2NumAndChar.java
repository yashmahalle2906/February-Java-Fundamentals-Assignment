package JavaFundamentals;

import java.util.Scanner;

public class Take2NumAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter character");
		char character = sc.next().charAt(0);
		if (character == '+') {
			System.out.println(a + b);

		} else if (character == '-') {
			System.out.println(a - b);

		} else if (character == '*') {
			System.out.println(a * b);

		} else {
			System.out.println(a / b);

		}

	}

}
