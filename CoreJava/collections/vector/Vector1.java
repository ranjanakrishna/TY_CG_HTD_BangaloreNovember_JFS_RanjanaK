package vector;

import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add(22);
		v1.add(78);
		v1.add(45);
		v1.add(34);
		System.out.println(v1);
		v1.remove(new Integer(22));
		System.out.println(v1);
		v1.set(1,67);
		System.out.println(v1);
		for(int i=0;i<v1.size();i++)
		{
			System.out.println(v1.get(i));
		}
		
	}
}
