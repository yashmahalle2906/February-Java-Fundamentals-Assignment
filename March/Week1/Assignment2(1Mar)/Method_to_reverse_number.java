package March01;

import java.util.Scanner;

public class Method_to_reverse_number {
	public static int reverse(int num) {
		int rev = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int num1 = sc.nextInt();
		int result = reverse(num1);
		System.out.println(result);

	}
}