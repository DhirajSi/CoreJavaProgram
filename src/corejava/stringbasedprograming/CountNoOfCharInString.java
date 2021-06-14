package corejava.stringbasedprograming;

public class CountNoOfCharInString {
	
	public static void main(String[] args) {
		int cout=0;
		String name="Dhiraj Singh";
		
		for(int i=0;i<name.length();i++) {
			
		
			if(name.charAt(i)!=' ') {
				cout++;
				
			}
				
			}
		System.out.println(cout);
		}

}
