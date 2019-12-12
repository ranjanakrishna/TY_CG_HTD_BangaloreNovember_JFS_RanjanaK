package treeSet;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Employee> t1=new TreeSet<Employee>();
		t1.add(new Employee(25,30000,"John"));
		t1.add(new Employee(24,40000,"Mikel"));
		t1.add(new Employee(21,20000,"Morgan"));
		t1.add(new Employee(19,80000,"Qwerty"));
		
		for (Employee e1 : t1) {
			System.out.println("empName is : "+e1.name);
			System.out.println("empAge is : "+e1.age);
			System.out.println("empSal is : "+e1.sal);
			System.out.println("--------------------------------");
		}
		
	}
}
