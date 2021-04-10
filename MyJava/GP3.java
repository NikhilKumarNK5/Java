import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class GP3
{
    public static void main(String[] args) 
	{
        GP3Writer.main(args);
        GP3Sorter.main(args);
    }
}

class GP3Writer
 {
    static TreeSet<Result> resultTreeSet = new TreeSet<>(new CompareResults());

    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numStudent = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < numStudent; i++) 
		{
            System.out.print("Enter RollNo SemNo Marks_Of_Five_Subject(Separated by space): ");
            String[] inp = (scan.nextLine()).split(" ");
            int[] marks = 
			{
                    Integer.parseInt(inp[2]),
                    Integer.parseInt(inp[3]),
                    Integer.parseInt(inp[4]),
                    Integer.parseInt(inp[5]),
                    Integer.parseInt(inp[6]),
            };
            Result result = new Result(
                    inp[0],
                    inp[1],
                    marks,
                    Arrays.stream(marks).sum()
            );
            resultTreeSet.add(result);
        }

        FileOutputStream writeFile = null;
        try 
		{
            writeFile = new FileOutputStream("gp3.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(writeFile);
            for (Result res : resultTreeSet) 
			{
                objectOutputStream.writeObject(res);
            }
            objectOutputStream.flush();
            writeFile.close();
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }

    }
}

class GP3Sorter 
{
    static TreeSet<Result> resultTreeSet;

    public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
        System.out.println("Sort using:\n1.RollNo\n2.Semester\n3.Total\n4.Semester & RollNO: ");
        int sortMethod = scan.nextInt();
        scan.nextLine();
        switch (sortMethod) {
            case 1:
                resultTreeSet = new TreeSet<>(new CompareResultsRoll());
                break;
            case 2:
                resultTreeSet = new TreeSet<>(new CompareResultsSem());
                break;
            case 3:
                resultTreeSet = new TreeSet<>(new CompareResultsSum());
                break;
            default:
                resultTreeSet = new TreeSet<>(new CompareResults());
        }

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("gp3.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            boolean check = true;
            while (check) {
                try {
                    Result res = (Result) ois.readObject();
                    resultTreeSet.add(res);
                } catch (EOFException ex) {
                    check = false;
                }
            }
            fis.close();
            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        for (Result res : resultTreeSet) {
            System.out.println("RollNo: " + res.getRollNo());
            System.out.print("Sem" + res.getSemester() + " ");
            for (int i : res.getScore()) {
                System.out.print(i + " ");
            }
            System.out.print("\nSum = "+res.getSum() + "\n");
            System.out.println("Average: " + (res.getSum() / 5));
        }
    }
}


class Result implements Externalizable 
{
    String RollNo, Semester;
    int[] score;
    int sum;
    transient String SerialVersionUID;

    public Result(String rollNo, String semester, int[] score, int sum) 
	{
        RollNo = rollNo;
        Semester = semester;
        this.score = score;
        this.sum = sum;
        this.SerialVersionUID = semester + "_" + rollNo;
    }

    public Result() 
	{
        System.out.println("Default Constructor called");
    }

    public String getSerialVersionUID() 
	{
        return SerialVersionUID;
    }

    public String getRollNo() 
	{
        return RollNo;
    }

    public String getSemester() 
	{
        return Semester;
    }

    public int[] getScore() 
	{
        return score;
    }

    public int getSum() 
	{
        return sum;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
	{
        out.writeObject(SerialVersionUID);
        out.writeObject(RollNo);
        out.writeObject(Semester);
        out.writeObject(sum);
        for (Object marks : score) 
		{
            out.writeObject(marks);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException 
	{
        SerialVersionUID = (String) in.readObject();
        RollNo = (String) in.readObject();
        Semester = (String) in.readObject();
        sum = (int) in.readObject();
        score = new int[5];
        for (int i = 0; i < 5; i++) {
            score[i] = (int) in.readObject();
        }
    }
}

class CompareResults implements Comparator<Result> 
{
    @Override
    public int compare(Result ob1, Result ob2) 
	{
        if (Integer.parseInt(ob1.getSemester()) > Integer.parseInt(ob2.getSemester())) 
		{
            return 1;
        } 
		else if (Integer.parseInt(ob1.getSemester()) < Integer.parseInt(ob2.getSemester())) 
		{
            return -1;
        } 
		else
		{
            if (Integer.parseInt(ob1.getRollNo()) > Integer.parseInt(ob2.getRollNo())) 
			{
                return 1;
            } 
			else if (Integer.parseInt(ob1.getRollNo()) < Integer.parseInt(ob2.getRollNo())) 
			{
                return -1;
            } 
			else return 0;
        }
    }
}

class CompareResultsSem implements Comparator<Result> 
{
    @Override
    public int compare(Result ob1, Result ob2) 
	{
        if (Integer.parseInt(ob1.getSemester()) > Integer.parseInt(ob2.getSemester())) 
		{
            return 1;
        }
		else if (Integer.parseInt(ob1.getSemester()) < Integer.parseInt(ob2.getSemester())) 
		{
            return -1;
        } else return 0;
    }
}

class CompareResultsRoll implements Comparator<Result> 
{
    @Override
    public int compare(Result ob1, Result ob2) 
	{
        if (Integer.parseInt(ob1.getRollNo()) > Integer.parseInt(ob2.getRollNo())) 
		{
            return 1;
        } 
		else if (Integer.parseInt(ob1.getRollNo()) < Integer.parseInt(ob2.getRollNo())) 
		{
            return -1;
        } 
		else return 0;
    }
}

class CompareResultsSum implements Comparator<Result> 
{
    @Override
    public int compare(Result ob1, Result ob2) 
	{
        if (ob1.getSum() > ob2.getSum()) 
		{
            return -1;
        } 
		else if (ob1.getSum() < ob2.getSum())
		{
            return 1;
        }
		else return 0;
    }
}