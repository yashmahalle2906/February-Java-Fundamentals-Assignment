package Feb16;

import java.util.Scanner;

public class Num_of_digit_in_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number");
		int num = scan.nextInt();
		int i = 0;
		for (i = 0; num > 0; i++) {
			num = num / 10;
		}
		System.out.println("Number of digits are " + i);
	}

}