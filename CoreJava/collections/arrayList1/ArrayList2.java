package arrayList1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ListIterator;

public class ArrayList2 {
	public static void main(String[] args) {
		System.out.println("--------------Collection methods-------------------");
		ArrayList <String> s1=new ArrayList<String>();
		s1.add("abc");
		s1.add("xyz");
		s1.add("pqr");
		
		System.out.println(s1);
		s1.remove("xyz");
		System.out.println(s1);
		System.out.println(s1.size());
		
		System.out.println(s1.isEmpty());
		
		s1.add("xyz");
		System.out.println(s1.contains("xyz"));
		System.out.println("----------------------------------------------");
		
		ArrayList <String> s2=new ArrayList<String>();
		s2.add("abc");
		s2.add("xyz");
		ArrayList <String> s3=new ArrayList<String>();
		s3.add("pqr");
		s3.add("mno");
		System.out.println(s2);
		s2.addAll(s3);
		System.out.println(s2);
		s2.removeAll(s3);
		System.out.println(s2);
		
		
		System.out.println("------------------------------------------");
		ArrayList <String> s4=new ArrayList<String>();
		s4.add("abc");
		s4.add("xyz");
		s4.add("pqr");
		ArrayList <String> s5=new ArrayList<String>();
		s5.add("pqr");
		s5.add("mno");
		System.out.println(s4);
		s4.retainAll(s5);
		System.out.println(s4);
		
		s4.clear();
		System.out.println(s4);
		
		System.out.println("-------------------------------------");
		Collection s6=new ArrayList();
		s6.add("abc");
		s6.add("xyz");
		s6.add("pqr");
		
		Object a[]=s6.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("------------------List methods-------------------");
		ArrayList <String> s7=new ArrayList<String>();
		
		s7.add(0,"abc");
		s7.add(1,"xyz");
		s7.add(2,"pqr");
		s7.add(3,"mno");
		s7.add(1,"abc");
		
		System.out.println(s7);
		s7.remove(2);
		System.out.println(s7);
		System.out.println(s7.indexOf("abc"));
		s7.add("abc");
		System.out.println(s7);
		System.out.println(s7.lastIndexOf("abc"));
		
		for(int i=0;i<s7.size();i++)
		{
			System.out.println(s7.get(i));
		}
		
		ArrayList <String> s8=new ArrayList<String>();
		s8.add("abc");
		s8.add("xyz");
		ArrayList<String> s9=new ArrayList<String>();
		s9.add("pqr");
		s9.add("mno");
		
		System.out.println(s8);
		s8.addAll(s9);
		System.out.println(s8);
		
		s8.set(1,"rst");
		System.out.println(s8);
		
		System.out.println(s8.subList(1,3));
		
		
		
		
	}
	
}
