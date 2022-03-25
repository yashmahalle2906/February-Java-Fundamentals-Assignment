package March09;

import java.util.Scanner;

public class Frequency_of_odd_and_even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns");
		int cols = scan.nextInt();

		
		int[][] mat = new int[row][cols];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				mat[i][j] = scan.nextInt();
			}
		}

		int count_even = 0;
		int count_odd = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				if (mat[i][j] % 2 == 0) {
					count_even++;
				} else {
					count_odd++;
				}
			}
		}

		System.out.println("Number of even:: " + count_even);
		System.out.println("Number of odd:: " + count_odd);

	}

}