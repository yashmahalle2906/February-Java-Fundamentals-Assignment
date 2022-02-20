package JavaFundamentals;

public class SquareOfSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			int sqaure = i * i;

			sum = sum + sqaure;

		}
		System.out.println(sum);
	}
}
