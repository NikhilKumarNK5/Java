//Area of Triangle with base and height
import java.lang.*;
import java.util.*;
class Triangle
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		float base,height,area;
		System.out.println("Enter base");
		base=sc.nextFloat();
		System.out.println("Enter height");
		height=sc.nextFloat();
		area=1f/2f*base*height;
		System.out.println("Area of the Triangle is "+area);
	}
}