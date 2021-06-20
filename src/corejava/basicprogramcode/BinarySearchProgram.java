package corejava.basicprogramcode;

public class BinarySearchProgram {

	public static int getIndex(int[] no, int key) {
		int mid = 0;
		int lastNo = no.length - 1;
		int firstNo = 0;
		while (firstNo <= lastNo) {
			if (no[firstNo] == key) {
				return firstNo;
			} else if (no[lastNo] == key) {
				return firstNo;
			} else {
				mid = (firstNo + lastNo) / 2;
				if (no[mid] == key) {
					return mid;
				} else {
					if (key > no[mid]) {
						firstNo = mid + 1;
					} else {
						lastNo = mid - 1;
					}
				}
			}
		}

		return key;

	}

	public static void main(String[] args) {
		int[] no = { 1, 2, 3, 4, 5, 6, 78, 89 };
		System.out.println(getIndex(no, 2));
	}

}
