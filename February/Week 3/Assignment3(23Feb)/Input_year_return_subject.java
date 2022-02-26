package Feb23;

import java.util.Scanner;

public class Input_year_return_subject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();
		String branch = sc.next();

		switch (year) {

		case 1:

			System.out.println("All subjects are common");

			break;

		case 2:
		case 3:
		case 4:

			switch (branch) {

			case "IT":
			case "CSE":

				System.out.println("Mainly Computer subject");

				break;

			case "EE":
			case "ECE":

				System.out.println("Mainly Electrical subject");

				break;

			case "Mechanical":

				System.out.println("Mainly Mechanical subject");

				break;
			default:

				System.out.println("Invalid branch Input");
				break;
			}

			break;
		default:

			System.out.println("Invalid year Input");

			break;

		}

	}

}
