/*Make a Menu Driven Program for Arithmetic Operaatios*/
//help in  this program
import java.lang.*;
import java.util.*;
public class MenuDrive
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("===");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Option in Words");
		String option = sc.nextLine();
		option = option.toUpperCase();
		switch(option)
		{
			case "ADD" : System.out.println("Sum = "+(x+y));
			break;
			case "SUB" : System.out.println("Differnce = "+(x-y));
			break;
			case "MUL" : System.out.println("Product = "+(x*y));
			break;
			case "DIV" : System.out.println("Division = "+(x/y));
			break;
			default : System.out.println("Invalid Option");
			break;
		}
	}
}