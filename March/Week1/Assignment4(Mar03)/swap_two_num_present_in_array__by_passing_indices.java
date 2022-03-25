package March03;


import java.util.Scanner;

public class swap_two_num_present_in_array__by_passing_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of arrays:: ");
		int len = scan.nextInt();
		Swap(len);

	}
	public static void Swap(int a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter elements of array:: ");
		int[] array = new int[a]; 
		
		
		for(int i=0;i<a;i++){
			array[i]=scan.nextInt();
		}
		System.out.println("Enter two indexes to swap:: ");
		int ind1 = scan.nextInt();
		int ind2 = scan.nextInt();
		array[ind1]=array[ind1]+array[ind2];
		array[ind2]=array[ind1]-array[ind2];
		array[ind1]=array[ind1]-array[ind2];
		
		for(int i=0;i<a;i++){
			System.out.println(array[i]);
		}
	}

}