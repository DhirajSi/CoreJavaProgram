import java.io.IOException;


 class Result {

	/*
	 * Complete the 'miniMaxSum' function below.
	 *
	 * The function accepts INTEGER_ARRAY arr as parameter.
	 */

	public void miniMaxSum() {
		int arrr[] = { 1, 2, 3, 4, 5 };
		int result = 0;

		for (int i = 0; i <= 4; i++) {
			int temp=0;
			for (int j = 0; j <= 4; j++) {
				if (temp == 0) {
					if (result < 15) {
						result = result + arrr[i];
					}
				} else {
					if (result < 15) {
						result = result + arrr[i];
					}

				}

			}
			
			System.out.println(result);
			temp=1;
			result = 0;

		}
	}
}


public class Test {
	public static void main(String[] args) throws IOException {

		Result rs = new Result();
		rs.miniMaxSum();

	}
}
