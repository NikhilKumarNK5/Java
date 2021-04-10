/*Display type of Website*/
import java.lang.*;
import java.util.*;
class Website
{
	public static void main(String args[])
	{
		String domian;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Domain name");
		domain = sc.nextLine();
		String ext = domain.substring(domain.lastIndexOf("."+1));
		switch(ext)
		{
			case "com" : System.out.println("Commercial Website");
			break;
			case "org" : System.out.println("Organizational Website");
			break;
			case "net" : System.out.println("Network Website");
			break;
			default : System.out.println("Error!");
			break;
		}
	}
}
//Facing problem in this program 
//there are errors I don't know why