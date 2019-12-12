package treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 {
	public static void main(String[] args) {
		TreeSet<Student> t1=new TreeSet<Student>();
		t1.add(new Student(21,"ramu"));
		t1.add(new Student(22,"shree"));
		t1.add(new Student(21,"ramu"));
		
		Iterator<Student> itr=t1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
