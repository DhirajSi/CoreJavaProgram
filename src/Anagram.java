import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String n1 = "ravi";
		String n2 = "vira";

		if (n1.length() == n2.length()) {

			char arr1[] = new char[5];
			char arr2[] = new char[5];
			String s1 = "";
			String s2 = "";

			for (int i = 0; i < n2.length(); i++) {
				arr1[i] = n1.charAt(i);
				arr2[i] = n2.charAt(i);

			}

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			for (int i = 0; i < arr1.length; i++) {
				s1 = s1 + arr1[i];
				s2 = s2 + arr2[i];

			}

			System.out.println(s1);

			System.out.println(s2);
			if (s1.equals(s2)) {
				System.out.println("its anagram");
			} else
				System.out.println("Not anagram");

		} else {
			System.out.println("Not anagram");
		}

	}
}
