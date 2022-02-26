package Feb24;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<=num;i++) {
			for(int j  =num-i;j>=1;j--) {
				System.out.print(" ");
			}
			
			
		for(int k=0;k<=i;k++) {
				System.out.print("* ");
			
			}
		System.out.println();
			
			
			
		}

	}
}

