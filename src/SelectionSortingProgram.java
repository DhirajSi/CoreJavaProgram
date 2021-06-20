
public class SelectionSortingProgram {

	public static void main(String[] args) {
		int arr[] = { 6, 2, 5, 8, 7 };

		for (int i = 0; i < arr.length; i++) {
			int index = i;
			for (int j = i; j < arr.length; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}

			}

		}

	}

}
