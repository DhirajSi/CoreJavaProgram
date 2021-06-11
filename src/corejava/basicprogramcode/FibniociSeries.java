package corejava.basicprogramcode;

public class FibniociSeries {
	//0 1 1 2 3 5 9
	public static void main(String[] args) {
		int result=0;
		int i=0;
		System.out.print(i);
		int j=1;
		System.out.print(" "+j);
		
		for (int k=0;k<=10;k++) {
			result=i+j;
			int temp=j;
			j=result;
			i=temp;
			
			System.out.print(" "+result);
			
		}
		
		
	}

}
