package March10;

public class Use_try_catch_for_exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 0;

		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			int z = x / y;
			int a = arr[6];
		} catch (ArithmeticException ex) {
			System.out.println("Exception catched");
		}

	}

}