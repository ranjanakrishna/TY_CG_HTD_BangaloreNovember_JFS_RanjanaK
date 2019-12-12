package assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		ArrayList<Employee> a1=new ArrayList<Employee>();
		a1.add(new Employee(28,"Divya"));
		a1.add(new Employee(22,"Shree"));
		
		ArrayList<Employee> a2=new ArrayList<Employee>();
		a2.add(new Employee(23,"navya"));
		a2.add(new Employee(21,"pinky"));
		
		TreeMap<String,ArrayList<Employee>> t1=new TreeMap<String,ArrayList<Employee>>();
		t1.put("Section1", a1);
		t1.put("Section2", a2);
		
		Set<Map.Entry<String, ArrayList<Employee>>> s1=t1.entrySet();
		
		for (Map.Entry<String, ArrayList<Employee>> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("---------------------------");
		}
		
	}
}
