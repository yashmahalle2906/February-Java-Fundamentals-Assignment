package Feb22;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		int i = num;
		while (i >= 1 ) {
			fact = fact * i;
			i--;
		}
		System.out.println(fact);

	}

}
