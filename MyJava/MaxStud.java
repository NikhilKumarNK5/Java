import java.util.*; 
import java.lang.*; 
  
class  MaxStud
{  
    static void getStudentsList(String[] file) 
    { 
        int avgScore; 
        int maxAvgScore = Integer.MIN_VALUE; 
  
        ArrayList<String> names = new ArrayList<>(); 
  
        for (int i = 0; i < file.length; i += 6) 
		{
            avgScore = (Integer.parseInt(file[i + 1]) +  
                        Integer.parseInt(file[i + 2]) +  
                        Integer.parseInt(file[i + 3]) +
						Integer.parseInt(file[i + 4]) +
						Integer.parseInt(file[i + 5])) / 5; 
  
            if (avgScore > maxAvgScore) 
			{ 
                maxAvgScore = avgScore; 
                names.clear(); 
                names.add(file[i]); 
            } 
  
            else if (avgScore == maxAvgScore) 
                names.add(file[i]); 
        }  
        for (int i = 0; i < names.size(); i++) 
		{ 
            System.out.print(names.get(i) + " "); 
        } 
  
        System.out.print(maxAvgScore); 
    } 
   
    public static void main(String args[]) 
    { 
        String[] file = {"Nishant", "79", "97", "76", "91", "86", 
						"Anuj", "79", "90", "76", "61", "86",
						"Varsha", "79", "97", "70", "91", "82",
						"Kalika", "65", "87", "56", "91", "86",
						"Rohit", "71", "97", "76", "91", "86",
						"Kanav", "99", "95", "74", "81", "83",
						"Karan", "65", "72", "76", "90", "86",
						"Priya", "69", "97", "71", "91", "70",
						"Rushali", "49", "57", "86", "69", "86",
						"Sarthak", "91", "77", "76", "71", "96",}; 
        getStudentsList(file); 
    } 
} 