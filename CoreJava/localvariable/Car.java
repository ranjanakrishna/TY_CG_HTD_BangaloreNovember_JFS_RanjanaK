package localvariable;

public class Car extends Vehicle {
	int cost=50000;
	void carDetails()
	{
		int cost=10000;
		System.out.println("local var: "+cost);
		System.out.println("global var: "+this.cost);
		System.out.println("superclass var: "+super.cost);
	}
}
