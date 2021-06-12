package corejava.basicprogramcode;

public class AramstrongNo {
	public static void main(String[] args) {
		
		
		int no=153;
		int orignNo=no;
		int rem=0;
		int result=0;
		
		while(no!=0) {
			rem=no%10;
			result=result+(int) Math.pow(rem, 3);
			no=no/10;
			
			
		}
		
		if(result==orignNo) {
		System.out.println("its armstrong No");
		}
		else{
			System.out.println("Not a armstrong no");
		}

		
		
	}

}
