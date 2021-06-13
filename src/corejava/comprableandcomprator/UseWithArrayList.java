package corejava.comprableandcomprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseWithArrayList {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Dhiraj"));
		list.add(new Student(7, "ravi"));
		list.add(new Student(4, "Mohan"));
		list.add(new Student(1, "ravi"));
		// This method for implemented by Comprable
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

		// This method for implemented by Comprator

//		System.out.println(list);
//		Collections.sort(list, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				return o1.sudentName.compareTo(o2.sudentName);
//			}
//		});
//		System.out.println(list);

		System.out.println(list);
		Collections.sort(list, (Student o1, Student o2)->o1.sudentName.compareTo(o2.sudentName));

		
		System.out.println(list);

	}

}
