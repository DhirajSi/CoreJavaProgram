package corejava.java8newfeature;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(6);
		list.add(7);
		list.add(9);
		list.add(7);
		// Normal way its called external loop
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}

		
		//Advance loop but external
//		for (Integer i : list) {
//
//			System.out.println(i);
//
//		}
//		
		
		//its called java 8 feature its internal
	//	list.forEach(i->System.out.println(i));
		
		
		Iterator<Integer> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
