package corejava.basicprogramcode;

public class PalindromNo {

	public static void main(String[] args) {
		int no = 151, rem,originalNo=no, sum=0;

		while (no != 0) {
			rem = no % 10;
			sum=(sum*10)+rem;
			no = no / 10;
			
		}
		if(sum==originalNo) {
			System.out.println("its Palindrome No");
		}
		else {
			System.out.println("its not Palindrom No");
		}

	}

}
