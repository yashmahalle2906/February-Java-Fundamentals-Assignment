package March07;

import java.util.Scanner;

public class swap_two_string_variable_without_using_temp_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		String str2 = scan.nextLine();

		str1 = str1 + str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);

	}

}
