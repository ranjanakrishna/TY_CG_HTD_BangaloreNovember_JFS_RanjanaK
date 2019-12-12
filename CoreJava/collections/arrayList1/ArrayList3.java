package arrayList1;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList<Double> a1=new ArrayList<Double>();
		a1.add(1.0);
		a1.add(1.1);
		a1.add(1.2);
		a1.add(1.1);
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		System.out.println(a1.contains(1.2));
		
		System.out.println(a1);
		a1.remove(1.1);
		System.out.println(a1);
		
		System.out.println("--------------------------------------------");
		
		ArrayList<Double> a2=new ArrayList<Double>();
		a2.add(1.0);
		a2.add(1.1);
		a2.add(1.3);
		ArrayList<Double> a3=new ArrayList<Double>();
		a3.add(1.2);
		a3.add(1.1);
		System.out.println(a2);
		a2.addAll(a3);
		System.out.println(a2);
		System.out.println(a2.containsAll(a3));
		a2.retainAll(a3);
		System.out.println(a2);
		a2.removeAll(a3);
		System.out.println(a2);
		
		System.out.println("--------------------------------------------------");
		
		ArrayList a4=new ArrayList();
		a4.add(1.0);
		a4.add(1.1);
		a4.add(1.3);
		
		Object a[]=a4.toArray();
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		a4.clear();
		System.out.println(a4);
		
		System.out.println("-----------------------------------------------------");
		
		ArrayList<Double> a5=new ArrayList<Double>();
		a5.add(0,2.1);
		a5.add(1,2.2);
		a5.add(2,2.3);
		
		System.out.println(a5);
		a5.remove(1);
		System.out.println(a5);
		a5.add(2.4);
		a5.add(2.3);
		System.out.println(a5);
		System.out.println(a5.indexOf(2.3));
		System.out.println(a5.lastIndexOf(2.3));
		System.out.println(a5.get(2));
		
		ArrayList<Double> a6=new ArrayList<Double>();
		a6.add(2.5);
		a6.add(2.6);
		a6.add(2.7);
		System.out.println(a5);
		a5.addAll(a6);
		System.out.println(a5);
		a5.set(2,2.1);
		System.out.println(a5);
		System.out.println(a5.subList(2,5));
		
		
	}
}
