package Feb23;

import java.util.Scanner;

public class Even_between_0to10_using_nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num <= 10) {
			if (num % 2 == 0) {
				System.out.println(num);
			}

		}

	}

}
