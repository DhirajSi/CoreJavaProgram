import java.io.BufferedReader;

public class palindromeString {

	public static void chekPalindromeOrNot(String str) {
		StringBuffer br = new StringBuffer(str);
		String str1 = br.reverse().toString();
		if (str.equals(str1)) {
			System.out.println("True");
		} else
			System.out.println("false");
	}

	public static void main(String[] args) {
		String name = "nitinr";

		String result = "";

//		for (int i = name.length() - 1; i >= 0; i--) {
//
//			result = result + name.charAt(i);
//
//		}
//
//		if (name.equals(result)) {
//			System.out.println("palindreome");
//		} else {
//			System.out.println("Not a palindrome");
//		}
		
		chekPalindromeOrNot("nitin");

	}

}
