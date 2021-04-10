import java.lang.*;
import java.util.*;
class Box 
{ 
    double width, height, depth; 
    Box(double w, double h, double d) 
    { 
        width = w; 
        height = h; 
        depth = d; 
    } 
    Box() 
    { 
        width = height = depth = 0; 
    } 
    Box(double len) 
    { 
        width = height = depth = len; 
    }  
    double volume() 
    { 
        return width * height * depth; 
    } 
} 
public class BoxVol 
{ 
    public static void main(String args[]) 
    {
        Box mybox1 = new Box(10, 15, 12); 
        Box mybox2 = new Box(); 
        Box mycube = new Box(10); 
  
        double vol;  
        vol = mybox1.volume(); 
        System.out.println(" Volume of mybox1 is " + vol); 
  
        vol = mybox2.volume(); 
        System.out.println(" Volume of mybox2 is " + vol); 
 
        vol = mycube.volume(); 
        System.out.println(" Volume of mycube is " + vol); 
    } 
} 