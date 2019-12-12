class Square
{
	static int area(int a)
	{
		int area=a*a;
		return area;
	}
 	static int perimeter(int a)
	{
		int perimeter=4*a;
		return perimeter;
	}
	public static void main(String arr[])
	{
		int area=area(2);
		int perimeter=perimeter(3);
		System.out.println("area of a square= "+area);
		System.out.println("perimeter of a square= "+perimeter);
	}
}