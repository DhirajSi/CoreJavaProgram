package corejava.basicprogramcode;

public class SelectionSorting {
	public static void main(String[] args) {
		int [] no= {5,7,4,3,9};
	
		
		for(int i=0;i<no.length;i++) {
			int minimumIndex=i;
			for(int j=0;j<no.length;j++) {
				
				if(no[j]>no[minimumIndex]) {
					minimumIndex=j;
				}
				
				int temp=no[i];
				no[i]=no[minimumIndex];
				no[minimumIndex]=temp;
				
			}
		}
		
	
		for(int i=0;i<no.length;i++) {
			System.out.println(no[i]);
		}
	}

}
