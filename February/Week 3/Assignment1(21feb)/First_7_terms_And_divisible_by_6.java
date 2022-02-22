package JavaFundamentals;

public class First_7_terms_And_divisible_by_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for (int i = 1; count <= 6; i++) {
			int terms = (i * (6 * i));
			if (terms % 6 == 0) {
				System.out.println(terms);
				count++;
			}
		}

	}

}
