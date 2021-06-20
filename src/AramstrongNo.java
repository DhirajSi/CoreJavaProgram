
public class AramstrongNo {
	public static void main(String[] args) {
		int no = 153,origanlValue = no;
		
		int result = 0;

		while (no != 0) {

			int rem = no % 10;
			result = result + (int) Math.pow(rem, 3);

			no = no / 10;

		}

		System.out.println(result);
	}

}
