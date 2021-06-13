package corejava.comprableandcomprator;

public class Student implements Comparable<Student> {

	 int rollNo;
	String sudentName;

	public Student(int rollNo, String sudentName) {
		super();
		this.rollNo = rollNo;
		this.sudentName = sudentName;
	}

	
	//This method for Comprable
	@Override
	public int compareTo(Student that) {

		return this.rollNo-that.rollNo;
	}

	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sudentName=" + sudentName + "]";
	}
	
	//This Comprator
	
	

}
