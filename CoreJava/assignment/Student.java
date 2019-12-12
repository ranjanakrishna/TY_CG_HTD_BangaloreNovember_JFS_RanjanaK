package assignment;

public class Student {
	String subject;
	int marks;
	public Student(String subject, int marks) {
		super();
		this.subject = subject;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [subject=" + subject + ", marks=" + marks + "]";
	}
	
	
	
	
	
}
