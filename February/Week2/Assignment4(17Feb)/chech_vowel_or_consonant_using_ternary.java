package Feb17;

import java.util.Scanner;

public class chech_vowel_or_consonant_using_ternary {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter small letter:: ");
		String a = scan.nextLine();
		char letter = (char) a.charAt(0);

		String result = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
				? "Its vowel"
				: "Its consonant";
		System.out.println(result);
	}
}