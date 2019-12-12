package treeMap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap3 {
	public static void main(String[] args) {
		SortingAge s1=new SortingAge();
		ArrayList<Student> a1=new ArrayList<Student>();
		a1.add(new Student(15,"Divya"));
		a1.add(new Student(12,"Shree"));
		a1.add(new Student(20,"navya"));
		
		ArrayList<Student> a2=new ArrayList<Student>();
		a2.add(new Student(6,"Anu"));
		a2.add(new Student(8,"Vidya"));
		
		ArrayList<Student> a3=new ArrayList<Student>();
		a3.add(new Student(9,"Navya"));
		a3.add(new Student(7,"Bhavya"));
		
		TreeMap<String,ArrayList<Student>> t1=new TreeMap<String,ArrayList<Student>>();
		t1.put("1st Standard", a1);
		t1.put("2nd Standard", a2);
		t1.put("3rd Standard", a3);
		
		System.out.println(t1.get("3rd Standard"));
		
		//Set<Map.Entry<String, ArrayList<Student>>> s1=t1.entrySet();
		
//		for (Map.Entry<String, ArrayList<Student>> e1: s1) {
//			System.out.println(e1.getKey());
//			System.out.println(e1.getValue());
//			System.out.println("------------------------");
//		}
//		
		
		
		
	}
}
