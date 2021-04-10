import java.util.Scanner;
public class TestPalindromicWord 
{
	public static void main(String[] args) 
	{
        TestPalindromicWord pWord = new TestPalindromicWord();
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Please Enter a word to test whether it is a palindrome or not");
        word = sc.next();
        pWord.run(word);
    }

    private void run(String word) 
	{
        String reverseWord = "";
        for (int i = word.length() - 1; i >= 0; i--) 
		{
            reverseWord += word.toLowerCase().charAt(i);
        }

        if (word.toLowerCase().equals(reverseWord.toLowerCase())) 
		{
            System.out.println(word+" is a palindrome");
        }
		else
		{
            System.out.println(word+" is not a palindrome");
        }
    }

}
