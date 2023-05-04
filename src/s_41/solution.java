package s_41;

import java.util.HashMap;
import java.util.Hashtable;

public class solution {

    public boolean isAnagram(String s, String t)
    {
       HashMap<Character,Integer>map=new HashMap<>();
       for(int i=0;i<s.length();i++)
       {
           char ch=s.charAt(i);
           if(map.containsKey(ch))
           {
               map.put(ch,map.get(ch)+1);
           }
           else
           {
               map.put(ch,1);
           }
       }
       for(int i=0;i<t.length();i++)
       {
           char ch=t.charAt(i);
           if(!map.containsKey(ch))
           {
               return false;
           }
           else if(map.get(ch)==1)
           {
               map.remove(ch);
           }
           else
           {
               map.put(ch,map.get(ch)-1);
           }

       }
       return map.size()==0;

    }
}



























