package March01;

import java.util.Scanner;

public class Method_to_swap_two_num {
	public static void  swap(int a ,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number :");
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		 swap(num,num1);

	}

}
