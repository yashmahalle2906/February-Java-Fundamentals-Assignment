package March04;

import java.util.Scanner;

public class Remove_A_given_word_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ab = new Scanner(System.in);

		System.out.print("Enter the string : ");
		String str = ab.nextLine();

		System.out.print("Enter the word that you want to remove form string : ");
		String str1 = ab.nextLine();

		str = str.replace(str1, "");

		System.out.println("The new string is : " + str);

		ab.close();
	}

}
