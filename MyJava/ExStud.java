import java.io.*;
import java.util.*;

class Students implements Externalizable
{
    private static final long SerialVersion=101;
    int sid;
    String name;
    String phone;
    transient int subject=5;


    public Students()
    {
        System.out.println("Default Constructor is called");
    }

    Students(int sid, String name, String phone)
    {
        this.sid=sid;
        this.name=name;
        this.phone=phone;
        subject=6; //initializing transient variable
    }



    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(sid);
        out.writeObject(name);
        out.writeObject(phone);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        sid=in.readInt();
        name=(String) in.readObject();
        phone=(String) in.readObject();

    }

    @Override
    public String toString() {
        return "\nStudent" +
                "\n * sid=" + sid +
                "\n * name='" + name + '\'' +
                "\n * phone='" + phone + '\'' +
                "\n * subject=" + subject +
                "\n";
    }
}

class IdSorts implements Comparator<Students>
{
    public int compare(Students o1, Students o2)
    {
        if(o1.sid < o2.sid)
            return -1;
        else
            return 1;
    }
}
class NameSorts implements Comparator<Students>
{
    public int compare(Students o1, Students o2)
    {
        return (o1.name.compareTo(o2.name));
    }
}

class PhoneSorts implements Comparator<Students>
{
    public int compare(Students o1, Students o2)
    {
        return (o1.phone.compareTo(o2.phone));
    }
}

public class ExStud 
{
    public static void main(String[] args) throws Exception {
        //Serialization of Student Object
		Students s1 = new Students(1,"Rahul","+917943562185");
        Students s2 = new Students(2,"Ankita","+916903742892");
        Students s3 = new Students(3,"Sameer","+919423931329");


        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\MyJava\\file1.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);

        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);

        oos.close();
        fos.close();

        //Deserialization Of Student Object
        List<Students> studentList=new ArrayList<>();
        //List<Students> studentList=new ArrayList<>();
        Students s1Deserialized;
        Students s2Deserialized;
        Students s3Deserialized;

        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\MyJava\\file1.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);

        s1Deserialized=(Students)ois.readObject();
        s2Deserialized=(Students)ois.readObject();
        s3Deserialized=(Students)ois.readObject();

        studentList.add(s1Deserialized);
        studentList.add(s2Deserialized);
        studentList.add(s3Deserialized);

        System.out.println("Original Students List: "+studentList);

        // Sorting via Student ID:
        Collections.sort(studentList,new IdSorts());
        System.out.println("\nSort By Id: "+ studentList);

        //Sorting by Name:
        Collections.sort(studentList,new NameSorts());
        System.out.println("\nSort by Name: "+ studentList);

        //Sorting by Phone:
        Collections.sort(studentList,new PhoneSorts());
        System.out.println("\nSort by Phone: "+ studentList);

    }
}
