package assignment;

public class Employee {
	int age;
	String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}
//	@Override
//	public int compareTo(Employee o) {
//		if(this.age>o.age) {
//			return 1;
//		}else if(this.age<o.age) {
//			return -1;
//		}else {
//			return 0;
//		}
//	}
	
}
