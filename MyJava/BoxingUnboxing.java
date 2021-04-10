import java.lang.*;

class Boxing
{				                         //Primitive to Wrapper 
	public void box()
	{
		int i=100;
		Integer j = Integer.valueOf(i);                 //Explicitly converting primitive "i" to wrapper "j" using function valueOf() this is called Boxing.
		Integer ab = i;                                //Compiler will implicitly call valueOf() function and convert int "i" to wrapper "j" that is called AutoBoxing.
		System.out.println("Primitive Value = "+i);
		System.out.println("Boxing Value = "+j);
		System.out.println("Autoboxing Value = "+ab);
	}
	public void box(int a, int b)
	{
		Integer x = a;
		Integer y = b;
		System.out.println("Primitive a in argument = "+a);
		System.out.println("Primitive b in argument = "+b);
		System.out.println("Wrapper x = "+x);
		System.out.println("Wrapper y = "+y);
	}
}
class Unboxing
{				                        //Wrapper to Primitive
	public void unbox()
	{
		Integer i = new Integer(100);
		int j = i.intValue();                          //Explicitly converting wrapper "i" to primitive "j" using function intValue() that is called Unboxing.
		int ab = i;                                   //Compiler will implicitly call intValue() function and convert wrapper "i" to primitive "j" that is called AutoUnboxing. 
		System.out.println("Wrapper Value = "+i);
		System.out.println("Unboxing Value = "+j);
		System.out.println("AutoUnboxing Value = "+ab);
	}
	public void unbox(Integer a,Integer b)
	{
		int x = a;
		int y = b;
		System.out.println("Wrapper a in argument = "+a);
		System.out.println("Wrapper b in argument = "+b);
		System.out.println("Primitive x = "+x);
		System.out.println("Primitive y = "+y);			
	}
}
public class BoxingUnboxing
{
	public static void main(String[] args)
	{
		Boxing b = new Boxing();
		b.box();
		b.box(10,20);
		Unboxing u = new Unboxing();
		u.unbox();
		u.unbox(new Integer(10),new Integer(20));
	}
}
