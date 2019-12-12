package linkedList;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(23);
		l1.add(34);
		l1.add(21);
		l1.add(56);
		System.out.println("--------peek, peekFirst & peekLast-------------");
		System.out.println(l1);
		System.out.println(l1.peek());
		System.out.println(l1.peekFirst());
		System.out.println(l1.peekLast());
		System.out.println(l1);
		
		System.out.println("-----poll, pollFirst & pollLast-------------");
		System.out.println(l1.poll());
		System.out.println(l1.pollFirst());
		System.out.println(l1.pollLast());
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(23);
		l2.add(34);
		l2.add(21);
		System.out.println("----------offer , offerFirst & offerLast------------");
		System.out.println(l2);
		l2.offer(56);
		System.out.println(l2);
		l2.offerLast(67);
		System.out.println(l2);
		l2.offerFirst(33);
		System.out.println(l2);
		System.out.println();
	}
}
