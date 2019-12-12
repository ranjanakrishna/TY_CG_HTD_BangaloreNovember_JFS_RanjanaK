package vector;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		Vector v1=new Vector();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.add(23);
		v1.add(45);
		v1.add(34);
		v1.add(27);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		v1.setSize(6);
		System.out.println(v1.size());
		System.out.println(v1);
		v1.add(38);//it'll add after the null values, if null is present
		System.out.println(v1.size());
		System.out.println(v1);
		v1.set(5, 89);//null can be replaced but cannot add values between values when size is set
		System.out.println(v1);
	}
}
