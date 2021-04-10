 import java.lang.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Employee
{
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    int id;
    String name;
    int salary;
    int age;
    String doj; 

    public Employee(int id, String name, int salary, int age, String datetxt) throws ParseException {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;

        Date c=sdf.parse(datetxt);
        this.doj=sdf.format(c); 
    }

    @Override
    public String toString() {
        return "Employee" +
                "\n * Id=" + id +
                "\n * Name='" + name + '\'' +
                "\n * Salary=" + salary +
                "\n * Age=" + age +
                "\n * DoJ=" + doj +
                "\n";
    }
}

public class Emp
{
    public static void main(String[] args) throws ParseException 
	{
        List<Employee> employeeList=new ArrayList<>();

        Employee e1 = new Employee(1,"Rahul",25000,27,"15-02-2014");
        Employee e2 = new Employee(2,"Mayank",30000,29,"19-12-2011");
        Employee e3 = new Employee(3,"Kalika",50000,30,"07-07-2016");
        Employee e4 = new Employee(4,"Pranav",15000,24,"24-11-2020");
        Employee e5 = new Employee(5,"Nishtha",37000,23,"05-07-2018");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        System.out.println("Original Sequence: "+employeeList);
		System.out.println();


        //Sort by Id
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) 
			{
                if(o1.id < o2.id)
					return -1;
                else if(o1.id == o2.id)
                    return (o1.name.compareTo(o2.name));
                else
                    return 1;
            }
        });

        System.out.println("\nSort by Id: "+employeeList);
		System.out.println();

        //Sort by name
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) 
			{
                    return (o1.name.compareTo(o2.name));

            }
        });

        System.out.println("\nSort by Name: "+ employeeList);
		System.out.println();

        //Sort by Age
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) 
			{
                if(o1.age < o2.age)
                    return -1;
                else if(o1.age == o2.age)
                    return (o1.name.compareTo(o2.name));
                else
                    return 1;
            }
        });

        System.out.println("\nSort by Age: "+employeeList);
		System.out.println();

        //Sort by Date
        Collections.sort(employeeList, new Comparator<Employee>() {
            SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            @Override
            public int compare(Employee o1, Employee o2) 
			{

                try 
				{
                    return sdf.parse(o1.doj).compareTo(sdf.parse(o2.doj));
                } 
				catch (ParseException e)
				{
                    throw new IllegalArgumentException(e);
                }

            }
        });

        System.out.println("Sort by Date: "+ employeeList);

    }
}
