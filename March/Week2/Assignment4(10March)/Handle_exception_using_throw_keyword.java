package March10;

public class Handle_exception_using_throw_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;

		int arr[] = { 1, 2, 3, 4, 5 };

		try {
			if (num2 == 0)
				throw new ArithmeticException();

			int num3 = num1 / num2;
			int a = arr[6];
		} catch (ArithmeticException ex) {
			System.out.println("Exception catched...");
		}

	}

}
