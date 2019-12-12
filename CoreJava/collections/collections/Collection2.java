package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		
		c1.add("abc");
		System.out.println(c1);
		
		c1.remove("abc");
		System.out.println(c1);
		
		System.out.println(c1.size());
		System.out.println(c1.isEmpty());
		
		c1.add("xyz");
		System.out.println(c1.contains("xyz"));
	}
}
