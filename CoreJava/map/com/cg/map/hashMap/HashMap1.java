package com.cg.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {
		HashMap <Integer,String> h1=new HashMap<Integer,String>();
		
		h1.put(7,"ramesh");
		h1.put(5,null);
		h1.put(3,null);
		h1.put(9,"suresh");
		h1.put(7,"divya");
		h1.put(null,"navya");
		h1.put(null, "vidya");
		
		
		Set<Map.Entry<Integer,String>> s1=h1.entrySet();
		
		for(Map.Entry<Integer,String> e1:s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("------------------------------");
		}
		System.out.println(h1.size());
		System.out.println(h1.isEmpty());
		
		
	}
}
