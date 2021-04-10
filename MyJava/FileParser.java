import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class FileParser 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		String para = "Dwelling and speedily ignorant any steepest. Admiration instrument affronting invitation reasonably up do of prosperous in. Shy saw declared age debating ecstatic man. Call in so want pure rank am dear were. Remarkably to continuing in surrounded diminution on. In unfeeling existence objection immediate repulsive on he in. Imprudence comparison uncommonly me he difficulty diminution resolution. Likewise proposal differed scarcely dwelling as on raillery. September few dependent extremity own continued and ten prevailed attending. Early to weeks we could.Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows.";
		System.out.println(para);
        System.out.print("----Enter string to search: ");
        String token = sc.nextLine();
        int count = 0;
        try 
		{
            RandomAccessFile file = new RandomAccessFile("C:\\Users\\HP\\MyJava\\fileGP4.txt", "r");
            file.seek(0);
            long current = 0;
            while (current < file.length()) 
			{
                String result = file.readLine();
                for (String word : result.split(" ")) 
				{
                    if (word.equals(token)) 
					{
                        count++;
                    }
                }
                current = file.getFilePointer();
            }
            file.close();
        } 
		catch (IOException e)
		{
            e.printStackTrace();
        }

        System.out.println("Total occurrence of " + token + ": " + count);

    }
}