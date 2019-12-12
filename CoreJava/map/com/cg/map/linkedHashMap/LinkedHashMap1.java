package com.cg.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap <String,Integer>l1=new LinkedHashMap <String,Integer>();
		l1.put("BTR", 678000);
		l1.put("BTM", 568909);
		l1.put("Rajajinagar",567809);
		l1.put(null, 678000);
		l1.put(null, 678000);
		l1.put("BTR", null);
		System.out.println(l1);
		
//		System.out.println(l1.size());
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.containsKey("BTR"));
//		System.out.println(l1.containsValue(568909));
//		System.out.println(l1.keySet());
//		System.out.println(l1.values());
//		System.out.println(l1);
//		l1.remove("BTR");
		
		Set<Entry<String, Integer>> s1=l1.entrySet();
		
		for (Map.Entry<String, Integer> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("-----------------------------");
		}
	}	
}
