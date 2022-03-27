package Feb17;

import java.util.Scanner;

public class print_name_of_month_by_passing_month_using_if_else {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter month number:: ");
		int month_no = scan.nextInt();

		if (month_no == 1) {
			System.out.println("January");
		} else if (month_no == 2) {
			System.out.println("Feburary");
		} else if (month_no == 3) {
			System.out.println("March");
		} else if (month_no == 4) {
			System.out.println("April");
		} else if (month_no == 5) {
			System.out.println("May");
		} else if (month_no == 6) {
			System.out.println("June");
		} else if (month_no == 7) {
			System.out.println("July");
		} else if (month_no == 8) {
			System.out.println("August");
		} else if (month_no == 9) {
			System.out.println("September");
		} else if (month_no == 10) {
			System.out.println("October");
		} else if (month_no == 11) {
			System.out.println("November");
		} else if (month_no == 12) {
			System.out.println("December");
		} else {
			System.out.print("Incorrect month number");
		}
	}

}
