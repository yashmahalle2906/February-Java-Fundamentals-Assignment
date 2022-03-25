package March03;

import java.util.Scanner;

public class Find_last_index_at_which_element_is_present {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 10 elements of array:: ");
		int[] array = new int[10];
		int idx = 0;

		for (int i = 0; i < 10; i++) {
			array[i] = scan.nextInt();
		}
		System.out.println("Enter element to search in array:: ");
		int ele = scan.nextInt();

		for (int j = 0; j < 10; j++) {
			if (array[j] == ele) {
				idx = j;

			}
		}
		System.out.println(idx);

	}

}
