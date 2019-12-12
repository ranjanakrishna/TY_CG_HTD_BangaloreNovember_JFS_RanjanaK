package linkedList;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(20);
		l1.add(45);
		l1.add(30);
		System.out.println("--------addFirst & addLast---------------");
		System.out.println(l1);
		l1.addFirst(50);
		System.out.println(l1);
		l1.addLast(45);
		System.out.println(l1);
		System.out.println("---------------remove--------------");
		l1.remove();
		System.out.println(l1);
		System.out.println("------------removeFirst & removeLast--------------");
		l1.removeFirst();
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		
		
		l1.add(50);
		System.out.println(l1);
		System.out.println("==========getFirst & getLast==================");
		System.out.println(l1);
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		LinkedList l2=new LinkedList();
		l2.add(2);
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		System.out.println(l2);
		l2.removeFirstOccurrence(2);
		l2.removeLastOccurrence(2);
		System.out.println(l2);
	
	}
}
