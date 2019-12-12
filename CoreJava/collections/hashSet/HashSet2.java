package hashSet;

import java.util.HashSet;

public class HashSet2 {
	public static void main(String[] args) {
		HashSet<Student> h1=new HashSet<Student>();
		h1.add(new Student(22,"shree"));
		h1.add(new Student(21,"anu"));
		h1.add(new Student(23,"divya"));
		h1.add(new Student(22,"shree"));
		
		for(Student s1:h1)
		{
			System.out.println(s1.studName+ "and age is " +s1.studAge);
		}
	}
}
