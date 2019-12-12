class Method
{
	static void add(int a,int b)
	{
		System.out.println("res is "+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("res is "+(a-b));
	}
	static void mul(int a,int b)
	{
		System.out.println("res is "+(a*b));
	}
	static void div(int a,int b)
	{
		System.out.println("res is "+(a/b));
	}
	static void mod(int a,int b)
	{
		System.out.println("res is "+(a%b));
	}
	public static void main(String arr[])
	{
		add(30,40);
		sub(10,30);
		mul(10,20);
		div(50,10);
		mod(20,10);
	}
}