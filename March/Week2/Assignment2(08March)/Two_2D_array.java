package March08;

import java.util.Scanner;

public class Two_2D_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int [][]array =new int[4][3];
		for(int i=0;i<4;i++) {
			for(int j =0;j<3;j++) {
				
				int val=sc.nextInt();
			array[i][j]=val;
				
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j =0;j<3;j++) {
				
				System.out.print(array[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
