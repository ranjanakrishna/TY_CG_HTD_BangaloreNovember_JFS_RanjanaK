package linkedList;

import java.util.LinkedList;

public class LinkedList4 {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(12);
		l1.add(22);
		l1.add(34);
		System.out.println("-----push(),pop() & element()----------------");
		System.out.println(l1);
		l1.push(45);
		System.out.println(l1);
		l1.pop();
		System.out.println(l1);
		System.out.println(l1.element());
		System.out.println(l1);
		
	}
}
