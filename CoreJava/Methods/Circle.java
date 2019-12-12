class Circle
{
	static double area(int r)
	{
		double area=3.142*r*r;
		return area;
	}
 	static double perimeter(int r)
	{
		double perimeter=2*3.142*r;
		return perimeter;
	}
	public static void main(String arr[])
	{
		double area=area(2);
		double perimeter=perimeter(3);
		System.out.println("area of a circle= "+area);
		System.out.println("perimeter of a circle= "+perimeter);
	}
}