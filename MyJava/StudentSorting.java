import java.io.*;
import java.util.*;
 
class Student implements Comparable<Student>
{
    private int age;
    private String name;
    private int rollno;
 
    // Used to sort student by rollno
    public int compareTo(Student s)
    {
        return this.rollno - s.rollno;
    }
 
    public Student(String nm, int ag, int rn)
    {
        this.name = nm;
        this.age = ag;
        this.rollno = rn;
    }
 
    // Getter methods for accessing private data
    public double getAge() 
    { 
        return age; 
    }
    public String getName()   
    {  
        return name; 
    }
    public int getRollno()      
    {  
        return rollno;  
    }
}
class StudentName implements Comparator<Student>
{
    public int compare(Student s1, Student s2)
    {
        //Used to sort student by name in alphabetical
        return s1.getName().compareTo(s2.getName());
    }
} 


public class StudentSorting
{
    public static void main(String[] args)
    {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("Nikhil",22,4));
        list.add(new Student("Kanav",21,5));
        list.add(new Student("Ritika",25,1));
        list.add(new Student("Ankit",24,3));
 
        Collections.sort(list);
 
        System.out.println("Students after sorting in ascending order of their roll no : ");
        for (Student stud: list)
        {
            System.out.println("Roll no :" + stud.getRollno() + " " + "Name :" + stud.getName() + " " + "and Age :" + stud.getAge());
        }
		
		System.out.println("\nStudents after sorting in alphabetical order of name :");
        StudentName studentname = new StudentName();
        Collections.sort(list, studentname);
        for (Student stud: list)
        {
           System.out.println("Roll no :" + stud.getRollno() + " " + "Name :" + stud.getName() + " " + "and Age :" + stud.getAge());
        }
    }
}


