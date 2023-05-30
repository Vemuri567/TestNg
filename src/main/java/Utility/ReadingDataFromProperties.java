package Utility;

import java.io.*;
import java.util.Properties;

public class ReadingDataFromProperties {
    public static void main(String[] args) throws IOException {
        File f=new File("D:\\VFC project\\Feb2023Batch\\src\\main\\resources\\config.properties");
        FileReader fs=new FileReader(f);
        Properties prop=new Properties();
        prop.load(fs);
        System.out.println(prop.get("username"));
    }
}
