import java.io.*;

public class File
{
    public static void main(String[] args) throws Exception {
        int nPlus=2;
        FileInputStream fis=new FileInputStream("C:\\Users\\HP\\MyJava\\file1.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

		//OutputStream os=new FileOutputStream("C:\\Users\\HP\\MyJava\\file2.txt");

        byte Data[] = new byte[1024];
        int count=0;
        List<String> fileNameList = new ArrayList<>();

        String sourcePath = "C:\\Users\\HP\\MyJava\\";
        while ((count=bis.read(Data)) != -1) 
		{
			//System.out.println(count);
            String fileName=new String("file"+(nPlus++) +".txt");
            OutputStream os=new FileOutputStream(sourcePath +fileName);
            os.write(Data,0,count);
            fileNameList.add(fileName);
            os.close();
        }

        System.out.println(fileNameList);

        //combine file code
        byte DataNew[]=new byte[fileNameList.size()*1024];
        OutputStream osnew=new FileOutputStream(sourcePath + "combine.txt", true);
        for(int i=0; i<fileNameList.size();i++) {
            int count2 = -1;
            BufferedInputStream bis2=new BufferedInputStream(new FileInputStream(sourcePath + fileNameList.get(i)));
            while ((count2=bis2.read(Data)) != -1) {
                osnew.write(Data,0,count2);
            }
        }
        osnew.close();

        System.out.println(DataNew.length);



    }
}
