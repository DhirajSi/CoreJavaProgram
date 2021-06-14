package corejava.stringbasedprograming;

import java.util.Arrays;

public class AnagramOfString {
	public static void main(String[] args) {

		String name1 = "ABB";
		String name2 = "BAB";
		String n1 = "";
		String n2 = "";

		char[] s1 = name1.toLowerCase().toCharArray();
		char[] s2 = name2.toLowerCase().toCharArray();

		Arrays.sort(s1);
		Arrays.sort(s2);

		for (int i = 0; i < s1.length; ++i) {
			System.out.println(i);
			n1 = n1 + s1[i];
		}
		for (int j = 0; j < s2.length; j++) {
			System.out.println(j);
			n2 = n2 + s2[j];
		}
		System.out.println(n1 + "%%%%%%%%%" + n2);
		if (n1.equals(n2)) {
			System.out.println(" Its anagram");
		} else {
			System.out.println("its not a anagram");
		}

	}

}
