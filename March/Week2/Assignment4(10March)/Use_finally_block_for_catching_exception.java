package March10;

public class Use_finally_block_for_catching_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;

		try {
			int num3 = num1 / num2;
		} catch (Exception ex) {
			System.out.println("Exception catched");
		}

		finally {
			System.out.println("In finally block");
		}

	}

}
