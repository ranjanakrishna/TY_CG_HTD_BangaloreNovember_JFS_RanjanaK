package collections;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
		c.add(12);
		c.add(23);
		Collection c1=new ArrayList();
		c1.add(25);
		c1.add(28);
		
		System.out.println(c);
		c.addAll(c1);
		System.out.println(c);
		System.out.println("------------------------------------");
		
		Collection c2=new ArrayList();
		c2.add(12);
		c2.add(23);
		c2.add(25);
		Collection c3=new ArrayList();
		c3.add(25);
		c3.add(28);
		
		c2.addAll(c3);
		System.out.println(c2);
		c2.removeAll(c3);
		System.out.println(c2);
		System.out.println("------------------------------------------");
		
		Collection c4=new ArrayList();
		c4.add(12);
		c4.add(23);
		c4.add(25);
		Collection c5=new ArrayList();
		c5.add(25);
		c5.add(23);
		c5.add(28);

		System.out.println(c4);
		c4.retainAll(c5);
		System.out.println(c4);
		
		System.out.println(c4.containsAll(c5));
		
		System.out.println(c4);
		c4.clear();
		System.out.println(c4);
		System.out.println("------------------------------------");
		
		Collection c6=new ArrayList();
		c6.add(12);
		c6.add(23);
		c6.add(25);
		
		Object a[]=c6.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
