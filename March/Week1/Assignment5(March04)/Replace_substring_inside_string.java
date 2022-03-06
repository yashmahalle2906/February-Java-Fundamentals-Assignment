package March04;

import java.util.Scanner;

public class Replace_substring_inside_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ab = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str = ab.nextLine();

		System.out.print("Enter the string that you want  to replace : ");
		String str1 = ab.nextLine();

		System.out.print("Enter the string that you want to add : ");
		String str2 = ab.nextLine();

		str = str.replaceAll(str1, str2);

		System.out.println(str);

		ab.close();

	}
}
