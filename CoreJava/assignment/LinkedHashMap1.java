package assignment;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		LinkedHashMap <String,Student> l1=new LinkedHashMap<String,Student> ();
		l1.put("Divya",new Student("English",84));
		l1.put("Shree",new Student("Kannada",78));
		l1.put("Anu",new Student("Hindi",89));
		
		l1.put(null,new Student("English",84));
		l1.put(null, new Student("Telugu",67));
		
		Set<Map.Entry<String, Student>> s1=l1.entrySet();
		
		for (Map.Entry<String, Student> e1 : s1) {
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------");
		}
		
	}
}
