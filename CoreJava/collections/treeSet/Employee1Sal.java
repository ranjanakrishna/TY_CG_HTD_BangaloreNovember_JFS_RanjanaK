package treeSet;

import java.util.Comparator;

public class Employee1Sal implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		if(o1.sal>o2.sal) {
			return 1;
		}
		else if(o1.sal<o2.sal){
			return -1;
		}
		else {
		return 0;
		}
	}

	
	
}
