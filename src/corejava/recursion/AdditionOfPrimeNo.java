package corejava.recursion;

public class AdditionOfPrimeNo {

	public static int getSum(int no) {

		if (no == 1) {
			return no;
		} else
			return no + getSum(no - 1);

	}

	public static void main(String[] args) {
		System.out.println(getSum(10));

	}

}
