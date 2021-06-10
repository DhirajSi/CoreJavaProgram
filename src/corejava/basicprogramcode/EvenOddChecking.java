package corejava.basicprogramcode;

public class EvenOddChecking {

	// return Even or Odd No
	public static void getEvenOddNo(int no) {

		int result = no % 2;
		if (result == 0) {
			System.out.println("Even No");
		} else
			System.out.println("odd No");

	}

	public static void main(String[] args) {
		EvenOddChecking.getEvenOddNo(42);
	}

}
