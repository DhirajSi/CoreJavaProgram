package corejava.basicprogramcode;

public class PrimeNoProgram {

	public static void getPrimeNoOrNot(int no) {
		if (no == 1) {
			System.out.println("Make sure enter number is greate then 1");
		} else {
			if (no % 2 == 0 || no % 3 == 0) {

				System.out.println("Not a Prime No");
			} else
				System.out.println("Prime No");
		}
	}

	public static void main(String[] args) {

		PrimeNoProgram.getPrimeNoOrNot(27);
	}

}
