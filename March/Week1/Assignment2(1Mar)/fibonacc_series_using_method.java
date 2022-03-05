package March01;

import java.util.Scanner;

public class fibonacc_series_using_method {
	public static void fibonacci(int num) {
		int a = 0; 
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		int count =2;
		int sum =0;
		
		while(count<num) {
			 sum = a+b;
			  System.out.println(sum);
			a=b;
			b=sum;
			count++;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		 fibonacci(num);
		

	}

}
