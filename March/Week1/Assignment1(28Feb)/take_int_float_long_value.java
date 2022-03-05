package Feb28;

import java.util.Scanner;

public class take_int_float_long_value {
	public static int multiply_int(int a, int b) {
		int product = (a * b);
		return product;
	}

	public static float multiply_float(float a, float b) {
		float product = (a * b);
		return product;
	}

	public static long multiply_long(long a, long b) {
		long product = (a * b);
		return product;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("For int multiplication");
		System.out.println("Enter first int num");
		int num1 = sc.nextInt();
		System.out.println("Enter second int num");
		int num2 = sc.nextInt();
		int result = multiply_int(num1, num2);
		System.out.println(result);
		System.out.println("For float multiplication");
		System.out.println("Enter first float num");
		float num3 = sc.nextFloat();
		System.out.println("Enter second float num");
		float num4 = sc.nextFloat();
		float result1 = multiply_float(num3, num4);
		System.out.println(result1);
		System.out.println("For long multiplication");
		System.out.println("Enter first long num");
		long num5 = sc.nextLong();
		System.out.println("Enter second long num");
		long num6 = sc.nextLong();
		long result2 = multiply_long(num5, num6);
		System.out.println(result2);

	}

}
