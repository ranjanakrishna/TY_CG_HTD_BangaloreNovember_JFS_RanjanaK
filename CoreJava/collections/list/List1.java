package list;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		
		l1.add(0, 12);
		l1.add(1,15);
		l1.add(2,87);
		l1.add(3,98);
		l1.add(1,110);
		l1.add(4,99);
		
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.indexOf(110));
		l1.add(110);
		System.out.println(l1);
		System.out.println(l1.lastIndexOf(110));
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("--------------------------------------------");
		
		List l2=new ArrayList();
		l2.add(45);
		l2.add(55);
		l2.add(66);
		List l3=new ArrayList();
		l3.add(45);
		l3.add(56);
		l2.addAll(1,l3);
		System.out.println(l2);
		
		List l4=new ArrayList();
		l4.add(45);
		l4.add(55);
		l4.add(66);
		l4.set(1,1000);
		System.out.println(l4);

		List l5=new ArrayList();
		l5.add(45);
		l5.add(55);
		l5.add(66);
		
		System.out.println(l5);
		List l6=l5.subList(0, 2);//itll not consider totindex's index
		System.out.println(l6);
		
	}
}
