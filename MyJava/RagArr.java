import java.util.*;
class RagArr 
{
    public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n = sc.nextInt();

        for (int i = 1; i < n; i++) 
		{
            for (int k = 1; k <= 2*n; k++) 
			{
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
			{
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) 
		{
            for (int k = 1; k <= (n+1- i )* 2; k++)
			{
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) 
			{
                System.out.print(j + " ");
            }
            System.out.println();
		}
	}
}