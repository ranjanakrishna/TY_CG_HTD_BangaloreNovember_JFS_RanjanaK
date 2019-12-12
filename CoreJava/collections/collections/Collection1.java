package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		//adding elts 
		c.add(12);
		System.out.println(c);
		//removing elts
		c.remove(12);
		System.out.println(c);
		
		//finding size of an collection
		System.out.println(c.size());
		
		//checking collection is empty or not
		System.out.println(c.isEmpty());
		
		c.add(12);
		//checking whether object is present or not
		System.out.println(c.contains(12));
		}
}
