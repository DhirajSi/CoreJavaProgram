package corejava.exceptionhandling;

public class A {
	static int result = 0;

	public static void handleError() {
		try {

			// int result = UseOfThrow.div(8, 0);
			result = 24 /8;
		
			throw new ArithmeticException();
		
		

		} catch (Exception e) {
			System.out.println("Please add this " + e.getMessage());
		}

		System.out.println("&&&&&&&&&" + result);

	}

}
