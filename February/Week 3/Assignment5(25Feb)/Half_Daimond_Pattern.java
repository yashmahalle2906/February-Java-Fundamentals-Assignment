package Feb25;

import java.util.Scanner;

public class Half_Daimond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i =1;i<num;i++) {
			for(int j=i;j<num;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	
		

	}

}
