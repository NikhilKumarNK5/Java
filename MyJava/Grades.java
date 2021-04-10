import java.util.Scanner;
public class Grades 
{

    private final int LOWEST_GRADE = 0;
    private final int HIGHEST_GRADE = 100;

    private int[] grades;

    private Scanner sc;

    public static void main(String[] args)
	{
        Grades grd = new Grades();
        grd.sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = grd.sc.nextInt();

        grd.run(numStudents);
    }

    private void run(int numStudents) 
	{
        if (numStudents <= 0) 
		{
            System.out.println("Invalid number of students.");
            return;
        }
        grades = new int[numStudents];
        double sum = 0;
        int i = 0;
        while (i < numStudents) 
		{
            System.out.printf("Enter the grade for student %1$d: ", (i + 1));
            int grade = sc.nextInt();

            // chek if grade is between 0 and 100
            if ((grade >= LOWEST_GRADE) && (grade <= HIGHEST_GRADE)) 
			{
                grades[i] = grade;
                sum += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %1$.2f\n", (sum / numStudents));
		
    }

}
