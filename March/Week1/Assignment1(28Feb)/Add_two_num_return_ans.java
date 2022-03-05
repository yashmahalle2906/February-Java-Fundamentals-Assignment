package Feb28;

import java.util.Scanner;

public class Add_two_num_return_ans {

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first num");
		int num1 = sc.nextInt();
		System.out.println("Enter second num");
		int num2 = sc.nextInt();
		int sum = add(num1, num2);
		System.out.println(sum);

	}

}
