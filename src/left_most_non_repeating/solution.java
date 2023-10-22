package left_most_non_repeating;

import java.util.HashMap;

public class solution {

    public static int nonRepeating(String str)
    {
       int i=0;
       boolean flag=true;
       for(i=0;i<str.length();)
       {
           for(int j=i+1;j<str.length();j++)
           {
               if(str.charAt(i)==str.charAt(j))
               {
                   flag=false;
                   i++;
                   break;
               }
           }
           if(flag==true)
           {
               return i;
           }

       }
       return -1;
    }


    public static int leftmostnonRepeating(String str)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else
            {
                map.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i))==1)
            {
                return i;
            }
        }
        return -1;
    }


}
