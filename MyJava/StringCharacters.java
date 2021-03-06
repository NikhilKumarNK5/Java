import java.lang.*;
import java.util.*;
public class StringCharacters { 
    static void countCharacterType(String text) 
    {
        int vowels = 0, consonant = 0, specialChar = 0, digit = 0 ,spaces = 0;  
        for (int i = 0; i < text.length(); i++) 
		{ 
              
            char ch = text.charAt(i); 
      
            if ( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ) 
			{             
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                    vowels++; 
                else
                    consonant++; 
            } 
            else if (ch >= '0' && ch <= '9') 
                digit++; 
            else if (ch == ' ')
				spaces++;
			else
                specialChar++; 
        } 
          
        System.out.println("Vowels: " + vowels); 
        System.out.println("Consonants: " + consonant); 
        System.out.println("Digits: " + digit); 
		System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + specialChar); 
    } 
      
    public static void main (String[] args) 
    { 
		String text = "To be or not to be, that is the question"
						+"Whether this nobler in the mind to suffer"
						+" the slings and arrows of outrageous fortune,"
						+" or to take arms against a sea of troubles,"
						+" and by opposing end them?";
						//int spaces = 0, vowels = 0, letters = 0;
		countCharacterType(text); 
    } 
} 