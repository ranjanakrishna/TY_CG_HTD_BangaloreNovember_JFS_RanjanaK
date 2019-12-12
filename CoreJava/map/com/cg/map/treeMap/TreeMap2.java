package com.cg.map.treeMap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
	public static void main(String[] args) {
		SortingAge s2=new SortingAge();
		TreeMap<Student,String> t1=new TreeMap<Student,String>();
		
		t1.put(new Student(9,"Divya"),"1st Standard");
		t1.put(new Student(23,"Shree"),"2nd Standard");
		t1.put(new Student(10,"Anu"),"8th Standard");
		
		Set<Map.Entry<Student, String>> s1=t1.entrySet();
		for (Map.Entry<Student, String> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-------------------------");
			
		}
		
	}
}
