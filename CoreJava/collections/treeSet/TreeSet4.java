package treeSet;

import java.util.TreeSet;

public class TreeSet4 {
	public static void main(String[] args) {
		Employee1Name e1=new Employee1Name();
		Employee1Age e2=new Employee1Age();
		Employee1Sal e3=new Employee1Sal();
		
		
		
		TreeSet<Employee1> t1=new TreeSet<Employee1>(e1);
		t1.add(new Employee1(25,30000,"Qwerty"));
		t1.add(new Employee1(24,40000,"Mikel"));
		t1.add(new Employee1(21,20000,"Morgan"));
		t1.add(new Employee1(19,80000,"John"));
		
		for (Employee1 emp : t1) {
			System.out.println("empName is : "+emp.name);
			System.out.println("empAge is : "+emp.age);
			System.out.println("empSal is : "+emp.sal);
			System.out.println("--------------------------------");
		}
	}
}
