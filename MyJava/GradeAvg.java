import java.util.*;
class GradeAvg 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of students : ");
        int no_students = sc.nextInt();
        int grade[] = new int[no_students];
        int total=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        int min_Student=-1,max_Student=-1;

        System.out.println("Enter the Grades for each Student: ");

        for(int i=0;i<no_students;i++)
        {
            System.out.print("Enter Student no. " + (i+1) + " Grade: ");
            grade[i]= sc.nextInt();
            if(grade[i] >=0 && grade[i] <=100) 
			{
                total = total + grade[i];
                if (min > grade[i]) 
				{
                    min = grade[i];
                    min_Student = i;
                }
                if (max < grade[i]) 
				{
                    max_Student = i;
                    max = grade[i];
                }
            }
            else {
                System.out.println("Grade Should be in range of 0 to 100 !");
                System.exit(0);
            }

        }

        double avg = (double)total/no_students;
        System.out.println("Total: "+ total);
        System.out.println("Average: "+ String.format("%.2f",avg));

        System.out.println("Minimum grade obtained by Student \"" + (min_Student+1) +"\" Grade: " + min);
        System.out.println("Maximum grade obtained by Student \"" + (max_Student+1) +"\" Grade: " + max);

    }
}
