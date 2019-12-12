
public class Array3 {
	public static void main(String[] args) {
		char a1[]=new char[4];
		
		a1[0]='a';
		a1[1]=10;
		a1[2]='c';
		a1[3]=90;
		System.out.println(a1.length);
		
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
	}
}
