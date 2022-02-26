package Feb22;

import java.util.Scanner;

public class Sum_of_n_number_using_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int sum=0;
		int i =1;
		while(i<=num) {
			sum=sum+i;
			i++;
		}
		System.out.println(sum);

	}

}
