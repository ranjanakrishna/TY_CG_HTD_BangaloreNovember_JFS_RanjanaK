package arrayDeque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
	public static void main(String[] args) {
		ArrayDeque a1=new ArrayDeque();
		
		a1.add(23);
		a1.add(2);
		a1.add(67);
		a1.addFirst(3);
		a1.addLast(9);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		ArrayDeque <String>a1=new ArrayDeque<String>();
//		a1.add("abc");
//		a1.add("pqr");
//		a1.addFirst("mno");
//		a1.addLast("def");
//		System.out.println(a1);
//		System.out.println(a1.getFirst());
//		System.out.println(a1.getLast());
//		a1.remove();
//		System.out.println(a1);
//		a1.removeFirst();
//		a1.removeLast();
//		System.out.println(a1);
//		
//		a1.add("abc");
//		a1.add("def");
//		a1.add("mno");
//		a1.add("abc");
//		System.out.println(a1);
//		a1.removeFirstOccurrence("abc");
//		a1.removeLastOccurrence("abc");
//		System.out.println(a1);
//		
		
		
	}
}
