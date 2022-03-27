package Feb16;

import java.util.Scanner;

public class Function_to_check_even_and_odd {
	public static int Check_Even_Odd(int a) {
		if (a % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();

		int result = Check_Even_Odd(num);

		if (result == 1) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}
	}

}
