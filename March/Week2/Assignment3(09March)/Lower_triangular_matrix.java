package March09;

import java.util.Scanner;

public class Lower_triangular_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();
		int[][] lowermat = new int[size][size];

		System.out.println("Enter the matrix:: ");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				lowermat[i][j] = scan.nextInt();
			}
		}

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i > j) {
					lowermat[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(lowermat[i][j] + " ");
			}
			System.out.println();
		}

	}

}