package March03;

import java.util.Scanner;

public class Find_difference_in_two_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of arrays:: ");
		int len = scan.nextInt();
		System.out.println("Enter elements of first array:: ");
		int[] arr1 = new int[len];

		for (int i = 0; i < len; i++) {
			arr1[i] = scan.nextInt();
		}
		System.out.println("Enter elements of second array:: ");
		int[] arr2 = new int[len];

		for (int i = 0; i < len; i++) {
			arr2[i] = scan.nextInt();
		}
		int[] arr3 = new int[len];
		for (int i = 0; i < len; i++) {
			arr3[i] = arr1[i] - arr2[i];
			System.out.print(arr3[i]+" ");
		}

	}

}