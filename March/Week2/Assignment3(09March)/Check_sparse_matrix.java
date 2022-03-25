package March09;

import java.util.Scanner;

public class Check_sparse_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows ");

		int row = scan.nextInt();

		System.out.println("Enter the number of columns  ");
		int cols = scan.nextInt();

		int[][] mat = new int[row][cols];
		System.out.println("Enter the matrix:: ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = scan.nextInt();
			}
		}
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] == 0) {
					count++;
				}
			}

		}
		if (count > ((row * cols) / 2)) {
			System.out.println("it is a sparse matrix");
		} else {
			System.out.println("it is not a sparse matrix");
		}

	}

}
