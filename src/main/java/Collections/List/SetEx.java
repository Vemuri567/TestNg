package Collections.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

    public static void main(String[] args) {
        Set<String> obj=new HashSet<>();

        obj.add("Naveen");
        obj.add("Akhil");
        obj.add("Syam");
        obj.add("Saif");
        obj.add("Nikhil");
        obj.add("Nikhil");
        System.out.println(obj);
        System.out.println(obj.size());
        for(String s:obj)
        {
            if(s.equals("Naveen"))
            {
                System.out.println("foreachloop"+s);
                break;
            }
            System.out.println("foreachloop"+s);
        }
        Iterator s=obj.iterator();
        while(s.hasNext())
        {
            String a=s.next().toString();
            //String a1=s.next().toString();
            if(a.equals("Naveen"))
            {

                System.out.println("Iteratorloop"+a);
                break;
            }
            System.out.println("Iteratorloop"+a);
        }
        obj.forEach((e)->{
            System.out.println("foreachallloop"+e);
        });
        Set<String> obj1=new TreeSet<>();
        obj1.add("Naveen");
        obj1.add("Akhil");
        obj1.add("Syam");
        obj1.add("Saif");
        obj1.add("Nikhil");
        obj1.add("Nikhila");
        System.out.println("Treeset:"+obj1);
        System.out.println(obj1.size());
        Set<String> union_data = new HashSet<String>(obj);
        union_data.addAll(obj1);
        System.out.println(union_data);
    }
}
