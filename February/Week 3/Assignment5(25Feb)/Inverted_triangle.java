package Feb25;

import java.util.Scanner;

public class Inverted_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int k = 0;
		for (int i = num - 1; i >= 0; i--) {

			for (int j = num - 1; j > k; j--) {
				System.out.print(" ");
			}

			System.out.print("*");

			for (int j = 1; j < (k * 2); j++) {
				System.out.print(" ");
			}
			if (i < num - 1)
				System.out.print("*");
			System.out.println();
			k++;
		}

	}

}
