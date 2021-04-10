//Area and Volume of Cuboid
import java.lang.*;
import java.util.*;
class Cuboid
{
	public static void main(String args[])
	{
		int length,breadth,height,area,volume;
		Scanner sc = new Scanner(System.in);
		//front and back area = l*h
		//right and left area = b*h
		//bottom and top area = l*b
		//Volume of Cuboid = l*b*h
		System.out.println("Enter the length");
		length = sc.nextInt();
		System.out.println("Enter the breadth");
		breadth = sc.nextInt();
		System.out.println("Enter the height");
		height = sc.nextInt();
		area = (length*height)+(breadth*height)*(length*breadth);
		volume = length*breadth*height;
		System.out.println("Area of Cuboid "+area);
		System.out.println("Volume of Cuboid "+volume);
	}
}