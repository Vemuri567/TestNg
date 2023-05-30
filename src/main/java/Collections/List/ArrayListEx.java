package Collections.List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

    public static void main(String[] args) {
        int[] a=new int[3];
        a[0]=1;
        a[1]=a[0]+2;
        System.out.println(a[0]);
        System.out.println(a.length);
        ArrayList<String> obj1=new ArrayList<>();
        System.out.println(obj1.size());
        ArrayList<String> obj=new ArrayList<>(3);
        obj.add("Naveen");
        obj.add("Syam");
        obj.add("Nikhil");
        obj.add("Saif");
        obj.add("Hi");
        obj.add("Hi");
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.get(0));
        for(int i=0;i<= obj.size()-1;i++)
        {
            System.out.println(obj.get(i));
        }
        for(String value:obj)
        {
            System.out.println(value);
        }
        obj.remove(obj.get(0));
        System.out.println(obj);
        System.out.println(obj.size());
        System.out.println(obj.contains("Syam"));
        Collections.sort(obj);
        System.out.println(obj);
        Collections.reverse(obj);
        System.out.println(obj);

    }
}
