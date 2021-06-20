package corejava.exceptionhandling;

public class UseOfThrow {

	public static int div(int a, int b) {
		int rusult = 0;
		try {
			rusult = a / b;
			throw new ArithmeticException();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return rusult;

	}

	public static void main(String[] args) {
		System.out.println(div(18, 7));
		System.out.println("dshfjgfj,");
	}

}
