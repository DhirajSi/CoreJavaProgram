package corejava.paaternprogram;

//  1
// 212
//32123

public class NoDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int no = 7 / 2;
		for (int i = 0; i <= no; i++) {
			for (int j = i; j <= no; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <=2 * i + 1; k++) {
				int temp= 2 * i + 1;
				
				
				System.out.print(temp);
				
			}
			System.out.println();
		}

		

	

	}

}
