package corejava.collectionframwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(8);
		list.add(7);
		list.add(9);
		list.add(1);
		list.add(6);
		
		System.out.println(list);
		//System.out.println(list.get(3));
		
		//System.out.println(list.indexOf(9));
	//	list.clear();
		//list.add(0, 89);
	//	System.out.println(list.isEmpty());
	//	System.out.println(list);
//	list.set(1, 99);
	//list.remove(0);
	//Collections.sort(list);
	System.out.println(Collections.max(list));
	System.out.println(Collections.min(list));
	
	
	System.out.println(list);
	
	
	Iterator< Integer> it= list.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	}
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
	for(Integer l:list) {
		System.out.println(l);
	}
		
	}

}
