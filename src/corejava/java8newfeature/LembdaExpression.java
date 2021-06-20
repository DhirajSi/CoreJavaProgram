package corejava.java8newfeature;

public class LembdaExpression {
	
	public static void main(String[] args) {
		
		
		FunctionalIntrfs obj=(a,b)->a+b;		
		
		
		int a=obj.add(8,9);
		System.out.println(a);
		
	}

}
