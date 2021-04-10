/*Find the type of Website and Protocol used*/
//http,https,ftp-protocol
//com-commercial website
//gov-government website ....
import java.lang.*;
import java.util.*;
class Web
{
	public static void main(String args[])
	{
		String url;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the URL : ");
		url = sc.nextLine();
		String protocol = url.substring(0,url.indexOf(":"));
		if(protocol.equals("http"))
		{
			System.out.println("Hyper Text Transfer Protocol");
		}
		else if(protocol.equals("https"))
		{
			System.out.println("Hyper Text Transfer Protocol Secure");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		String ext = url.substring(url.lastIndexOf("."+1));
		if(ext.equals("com"))
		{
			System.out.println("Commercial Website");
		}
		else if(ext.equals("org"))
		{
			System.out.println("Organizational Website");
		}
		else if(ext.equals("net"))
		{
			System.out.println("Network Website");
		}
	}
}