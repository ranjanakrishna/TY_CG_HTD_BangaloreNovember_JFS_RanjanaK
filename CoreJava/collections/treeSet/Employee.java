package treeSet;

public class Employee implements Comparable<Employee>{
	int age;
	double sal;
	String name;
	public Employee(int age, double sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}
//	@Override
//	public int compareTo(Employee o) {
//		if(this.sal>o.sal) {
//			return 1;
//		}
//		else if(this.sal<o.sal){
//			return -1;
//		}
//		else {
//		return 0;
//		}
//	}
	
//---------------------------------------------------------------	
//	@Override
//	public int compareTo(Employee o) {
//		if(this.age>o.age) {
//			return 1;
//		}
//		else if(this.age<o.age){
//			return -1;
//		}
//		else {
//		return 0;
//		}
//	}
	
	//--------------------------------------------------------------
	
	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.name);//ascending 
		
		//return o.name.compareTo(this.name);//descending 
		
	}
	
	
}
