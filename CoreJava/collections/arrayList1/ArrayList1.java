package arrayList1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		
		a1.add(12);
		a1.add(35);
		a1.add(38);
		
		System.out.println(a1);
		a1.remove(1);
		System.out.println(a1);
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1.get(i));
		}
		
		System.out.println("-----------for-each loop------------------");
		
		for(Integer i1:a1)
		{
			System.out.println(i1);
		}
		
		System.out.println("-------------iterator----------------------");
		Iterator<Integer> itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------------List iterator(fwd order)--------------------");
		//listIterator()->should be pass size of an array
		ListIterator<Integer> itr1=a1.listIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("--------------List iterator(reverse order)----------------------------");
		ListIterator<Integer> itr2=a1.listIterator(a1.size());
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
		
		
		System.out.println("-----------------------------------------------------");
		ArrayList <Integer> a2=new ArrayList<Integer>();
		a2.add(23);
		a2.add(24);
		System.out.println(a2);
		a2.remove(new Integer(23));//
		System.out.println(a2);
		
	}
}
