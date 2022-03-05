package Feb28;

import java.util.Scanner;

public class Return_max_value {
	public static int max(int a, int b) {
	if(a>b) {
		return a;
	}
	else {
		return b;
	}
	
	}
	public static int max1(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
		}
	public static int max2(int a, int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
		
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for 1st method");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int result =max(num1,num2);
		System.out.println("Max value for 1st method");
		System.out.println(result);
		System.out.println("Enter value for 2nd method");
		
		int num3=sc.nextInt();
		int num4=sc.nextInt();
		int result1 =max(num3,num4);
		System.out.println("Max value for 2nd method");
		System.out.println(result1);
		System.out.println("Enter value for 3rd method");
		int num5=sc.nextInt();
		int num6=sc.nextInt();
		int result2 =max(num5,num6);
		System.out.println("Max value for 3rd  method");
		System.out.println(result2);
		

	}

}
