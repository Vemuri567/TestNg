package Utility;

import java.io.*;

public class ReadingDataFromTextFiles {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\VFC project\\Feb2023Batch\\src\\main\\resources\\Sample.txt");
        FileReader fr=new FileReader(f);
        /*int i= fr.read();
        while(i!=-1)
        {
            System.out.print((char)i);
            i=fr.read();
        }*/
        BufferedReader br=new BufferedReader(fr);
        String s=br.readLine();
        while(s!=null)
        {
            System.out.println(s);
            s= br.readLine();
        }
    }
}
