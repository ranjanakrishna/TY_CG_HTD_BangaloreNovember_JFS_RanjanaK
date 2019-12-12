package vector;

import java.util.Vector;

public class Vector3 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(12);
		v1.addElement(23);
		v1.addElement(34);
		v1.addElement(67);
		v1.add(45);
		System.out.println(v1);
		v1.removeElement(new Integer(34));
		System.out.println(v1);
		v1.removeElementAt(2);
		System.out.println(v1);
		
		System.out.println("-----------------copyInto------------------");
		Object o1[]=new Object[v1.size()];
		v1.copyInto(o1);
		for(int i=0;i<o1.length;i++)
		{
			System.out.println(o1[i]);
		}
		
		System.out.println("-------------removeAll------------------");
		v1.removeAllElements();
		System.out.println(v1);
		
		
		/////////////////////////////////////////////////////////////////////
		Vector v2=new Vector();
		v2.addElement(34);
		v2.addElement(45);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.ensureCapacity(6);//it'll be fixed for vector
		v2.setSize(8);//(if its greater than ensCap)then vector cap will increase upto double of its initial ensure cap
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println(v2);
		
		
	}
}
