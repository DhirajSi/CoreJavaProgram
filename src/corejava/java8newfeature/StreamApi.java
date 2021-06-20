package corejava.java8newfeature;

import java.util.ArrayList;
import java.util.Date;

public class StreamApi {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
	for (int j = 0; j < 2000; j++) {
		list.add(7);
		list.add(6);
		list.add(4);
		list.add(17);
		list.add(27);
		list.add(24);
	}	
//	Date date = new Date();
//	 System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
		
//		list.stream().filter(i->i%2==0).forEach(System.out::println);
		
//		list.parallelStream().map(i->i).forEach(i->System.out.println(i));
		
		
	long t1=System.currentTimeMillis();
	//	list.stream().map(i->i).forEach(i->System.out.println(i));
	 for (int i = 0; i < list.size(); i++) {
		System.out.println(i);
	}
		
		System.out.println(System.currentTimeMillis()-t1+"jdgvdshh");

	}

}
