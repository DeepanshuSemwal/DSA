package s_46;

import java.util.HashMap;
import java.util.Map;

public class solution {

    public static void Duplicates(String str)
    {
        int n=str.length();
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }

        for(Map.Entry mapEntry : map.entrySet())
        {
            char key=(char)mapEntry.getKey();
            int value=(int)mapEntry.getValue();
            if(value>1)
            {
                System.out.println("key:" + key);
                System.out.println( " value :"+value);
            }

        }

    }

    public static void main(String[] args) {

        Duplicates("geeksforgeeksleetcode");
    }
}
