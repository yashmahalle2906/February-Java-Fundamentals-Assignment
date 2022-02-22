package JavaFundamentals;

import java.util.Scanner;

public class First3Termsof4N9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int count = 1;

		for (int i = 1; count <= 3; i++) {
			int terms = (4 * i + 9);
			if (terms % 3 == 0) {

			}
			System.out.println(terms);
			count++;

		}

	}
}
