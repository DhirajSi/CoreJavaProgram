package corejava.paaternprogram;

public class dimondProgramming {

	public static void main(String[] args) {
		int no = 7 / 2;
		for (int i = 0; i <= no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <=2 * i + 1; k++) {
				if (k == 1 || k == 2 * i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = no - 1; i >= 0; i--) {
			for (int j = i; j <= no; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				if (k == 1 || k == 2 * i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
