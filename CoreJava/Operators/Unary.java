class Unary
{
	public static void main(String ar[])
 	{
		int x=20;
		int res= x++ + ++x + --x + ++x + --x;

		System.out.println("result= "+res);
	}
}