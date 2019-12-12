class ElseIf
{
	public static void main(String ar[])
	{
		int a=20;
		int b=40;
		int c=80;
		int d=10;

		if(a>b && a>c && a>d){
		System.out.println("a is greater");
		}else if(b>c && b>d){
		System.out.println("b is greater");
		}else if(c>d){
		System.out.println("c is greater");
		}else{
		System.out.println("d is greater");
		}
	}
}