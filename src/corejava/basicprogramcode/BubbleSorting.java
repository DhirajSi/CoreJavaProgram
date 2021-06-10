package corejava.basicprogramcode;

public class BubbleSorting {

	public static void main(String[] args) {

		// This is Bubble sorting logic
		int no[] = { 12, 4, 56, 3, 11, 19 };

		for (int i = 0; i < no.length; i++) {
			for (int j = 1; j < no.length; j++) {

				if (no[j] < no[j - 1]) {

					int temp = no[j];
					no[j] = no[j - 1];
					no[j - 1] = temp;

				}

			}
		}
		for (int i = 0; i < no.length; i++) {

			System.out.println(no[i]);
		}
	}

}
