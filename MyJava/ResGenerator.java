import java.util.*;
class Result
{
    private String rollNo;
    private String semester;
    private double[] marks = new double[5];
    public Result(String r, String s, double[] m)
	{
        this.rollNo = r;
        this.semester = s;
        this.marks = m;
    }
    public String getRollNo()
	{
        return this.rollNo;
    }
    public String getSemester()
	{
        return this.semester;
    }
    public void getMarks()
	{
        double total=0.0;
        for(int i=0;i<marks.length;i++)
		{
            System.out.println("Marks in subject "+(i+1)+" = "+marks[i]);
            total = total+marks[i];
        }
        System.out.println("Total Sum = "+total);
    }
}
class CompareSemester implements Comparator<Result>
{
    public int compare(Result r1, Result r2)
	{
        return r1.getSemester().compareTo(r2.getSemester());
    }
}
public class ResGenerator
{
    public static void main(String[] args)
	{
        String rollno=" ";
        int flag=0;
        Scanner sc = new Scanner(System.in);
        TreeSet<Result> tree = new TreeSet<Result>(new CompareSemester());
        double[] stud11 = {64,67,92,74,88};
        Result r = new Result("01","1",stud11);
        double[] stud12 = {90,53,93,84,59};
        Result r2 = new Result("01","2",stud12);
        double[] stud13 = {96,674,75,85,38};
        Result r3 = new Result("01","3",stud13);
        double[] stud21 = {45,94,67,66,73};
        Result r4 = new Result("02","4",stud21);
        double[] stud22 = {87,67,95,59,95};
        Result r5 = new Result("02","5",stud22);
        double[] stud23 = {66,79,46,75,91};
        Result r6 = new Result("02","6",stud23);
        try
		{
            tree.add(r);
            tree.add(r2);
            tree.add(r3);
            tree.add(r4);
            tree.add(r5);
            tree.add(r6);
            System.out.println("Enter roll No:");
            rollno = sc.nextLine();
            for(Result re:tree)
			{
                if(rollno.equals(re.getRollNo()))
				{
                    System.out.println("-----------------------------------------------");
                    System.out.println("Roll no:"+re.getRollNo());
                    System.out.println("Semester:"+re.getSemester());
                    re.getMarks();
                    System.out.println("-----------------------------------------------");
                    flag=1;
                }
            }
            if(flag==0)
			{
                System.out.println("Please enter valid roll no");
            }
        }
		catch(Exception e)
		{
            System.out.println("Exception found in tree set main = "+e.getMessage());
        }
    }
}