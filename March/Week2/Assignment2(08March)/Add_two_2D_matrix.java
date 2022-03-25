package March08;

import java.util.Scanner;

public class Add_two_2D_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of rows  ");
		int row = scan.nextInt();

		System.out.println("Enter no. of columns ");
		int cols = scan.nextInt();
		System.out.println("Enter first matrix  ");

		int[][] arr1 = new int[row][cols];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				arr1[i][j] = scan.nextInt();

			}
		}

		System.out.println("Enter second matrix ");

		int[][] arr2 = new int[row][cols];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				arr2[i][j] = scan.nextInt();

			}
		}
		int[][] arr3 = new int[row][cols];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];

			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr3[i][j] + " ");

			}
			System.out.println();
		}

	}

}
