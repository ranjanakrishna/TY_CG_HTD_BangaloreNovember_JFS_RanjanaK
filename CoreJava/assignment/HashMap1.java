package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(34, "Shree");
		h1.put(12, "Divya");
		h1.put(23, "Navya");
		h1.put(34, "Shree");
		h1.put(34, "bhavya");
		
		Set<Map.Entry<Integer, String>> s1=h1.entrySet();
		
		for (Map.Entry<Integer, String> e1: s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------");
		}
		
		
		
		
	}
}
