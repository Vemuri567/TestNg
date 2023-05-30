package Strings;

import java.util.Locale;

public class Stringex {
    public static void main(String[] args) {
       /* //declaration of a string
        String s1="Naveen";//string literal(constant pool)
        String s2=new String("naveen");// 2 objects one in string constant pool and another in heap pool(to make memory efficient)
        //why string is immutable
        String s3="Welcome";
        String s4="welcome";
        String s5="Welcome";
        because java uses the concept of string literal.suppose there are 5 reference variables,all refers to one object "Welcome".If one reference variable changes
        the value of the object,it will be affected to all reference variables.That is why string objects are immutable*//*

        //String methods
        String s1="Naveen,Nikhil,Syam";
        String s2=",Saif";
        //toUpper
        System.out.println(s1.toUpperCase());
        //tolower
        System.out.println(s1.toLowerCase());
        //concatenation
        String s3=s1+s2;
        System.out.println(s3);
        //second way of concatenation
        String s4=s1.concat(s2);
        System.out.println(s4);
        String s5=1+2+"Naveen"+3+4;
        System.out.println(s5);
        String s6="a"+1+2+"b";
        System.out.println(s6);
        //length to return the no of chars i a string
        int length=s1.length();
        System.out.println(length);
        //to retrieve char from the string by using Index
        char ch=s1.charAt(0);
        System.out.println(ch);
        //to retrieve lastchar from the string
        char lastchar=s1.charAt(length-1);
        System.out.println(lastchar);
        //find whether Syam name is available in s1 string
        boolean flag=s1.contains("Saif");
        System.out.println(flag);
        //split
        String[] splittedstring=s1.split(",");
        int length1=splittedstring.length;
        for(int i=0;i<=length1-1;i++){
            String name=splittedstring[i];
            System.out.println(name);
        }
        //reverse words of a string
        String orgstring="I Love My Country";
        String reversewordsstring="";
        String[] split=orgstring.split(" ");
        for(int i=split.length-1;i>=0;i--)
        {
            reversewordsstring=reversewordsstring+split[i]+" ";

        }
        System.out.println(reversewordsstring);

        //reverse chars in a string
        String  orginalstring="I Love My Country";
        String reversechars="";
        for(int i=orginalstring.length()-1;i>=0;i--){
            reversechars=reversechars+orginalstring.charAt(i);
        }
        System.out.println(reversechars);

        //print How many times e repeated in the below string
        String countchar="naveen";
        int count=0;
        for(int i=0;i<=countchar.length()-1;i++)
        {
            char ch3=countchar.charAt(i);
            if(ch3=='e'){
                count++;
            }
        }
        System.out.println(count);*/
        //Find character position in a string
        String s8="naveen";
        int indexposition=s8.indexOf('e');
        System.out.println(indexposition);
        int indexposafterfirstindex=s8.indexOf('e',indexposition+1);
        System.out.println(indexposafterfirstindex);

        String s9="Vemuri Naveen kumar Vemuri";
        String[] splits=s9.split(" ");
        System.out.println(splits[1]);
        System.out.println(s9.split(" ")[1]);
        //replace
        System.out.println(s9.replaceAll("Vemuri","1").trim());

        //substring
        String cardno="VemuriNaveenKumar";
        int indexN=cardno.indexOf('N');
        System.out.println(indexN);
        int indexk=cardno.indexOf('K',indexN+1);
        System.out.println(indexk);
        System.out.println(cardno.substring(indexN, indexk));
        /*String first3chars=cardno.substring(0,1);
        String lastdigits=cardno.substring(3,cardno.length());
        System.out.println(lastdigits);
        System.out.println(first3chars);
        System.out.println(cardno.contains("."));*/

    }
}
