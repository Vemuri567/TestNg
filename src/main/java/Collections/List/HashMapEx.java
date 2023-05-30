package Collections.List;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {
        //key-value pair
      /* HashMap<String,String> obj=new HashMap<String,String>();
        obj.put("Name","Naveen");
        obj.put("Age","32");
        obj.put("Qualification","M.tech");
        obj.put("Name","Syam");
        System.out.println(obj.get("Name"));
        System.out.println(obj.get("Age"));
        System.out.println(obj.get("Qualification"));
        System.out.println(obj);
        System.out.println(obj.size());
        obj.replace("Name","Nikhil");
        for(String key: obj.keySet())
        {
            System.out.println(obj.get(key));
        }
        for(Map.Entry<String,String> key: obj.entrySet())
        {
            System.out.println(key.getKey());
            System.out.println(key.getValue());
        }*/

        String country="australia";
        LinkedHashMap<Character,Integer> obj=new LinkedHashMap<>();
        for(int i=0;i<=country.length()-1;i++)
        {
            Character ch=country.charAt(i);
            if(obj.containsKey(ch))
            {
                int value=obj.get(ch);
                value++;
                obj.replace(ch,value);

            }
            else
            {
                obj.put(ch,1);
            }
        }
        System.out.println(obj);
        for(Character ch: obj.keySet())
        {
            int value=obj.get(ch);
            if(value>1)
            {
                System.out.println(ch+"_is repeted_"+value+"_Times");
            }
        }
    }
}
