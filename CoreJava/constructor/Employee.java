package constructor;

public class Employee {
	String empName;
	int empAge;
	double empSalary;
	
	Employee(String name,int age,double sal)
	{
		empName=name;
		empAge=age;
		empSalary=sal;
	}
	void details()
	{
		System.out.println(" name: "+empName+" age: "+empAge+" salary: "+empSalary);
	}
}
