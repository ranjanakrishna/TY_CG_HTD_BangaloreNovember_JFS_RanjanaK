package hashSet;

import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		HashSet hs1=new HashSet();
		hs1.add(12);
		hs1.add(23);
		hs1.add(34);
		hs1.add(12);
		hs1.add(null);
		for(Object object:hs1)
		{
			//System.out.println(object.hashCode());
			System.out.println(object);
		}
		System.out.println("-------------------------------------");
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("abc");
		hs2.add("xyz");
		hs2.add("abc");
		hs2.add(null);
		for(Object o1:hs2)
		{
			System.out.println(o1);
		}
		
		
	}
}
