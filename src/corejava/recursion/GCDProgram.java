package corejava.recursion;

public class GCDProgram {

	public static int getGCD(int no1, int no2) {

		if (no1 == no2) {
			return no1;
		}

		if (no1 == 0) {
			return no2;
		}

		if (no2 == 0) {
			return no1;
		}

		if (no1 > no2) {
			return getGCD(no1 - no2, no2);
		} else if (no1 < no2)
			return getGCD(no1, no2 - no1);
		return 0;
	}

	public static void main(String[] args) {
		int result = GCDProgram.getGCD(36, 64);
		System.out.println(result);
	}

}
