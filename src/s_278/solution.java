package s_278;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {

    public static ArrayList<ArrayList<String>>groupShifting(String[]strings)
    {

        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String str:strings)
        {
            String key=getKey(str);
            if(!map.containsKey(key))
            {
                ArrayList<String>list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
            else
            {
                ArrayList<String>list=map.get(key);
                list.add(str);
            }
        }
        ArrayList<ArrayList<String>>res=new ArrayList<>();
//        for(ArrayList<String>al:map.values())
//        {
//            res.add(al);
//        }
        for(Map.Entry<String,ArrayList<String>>mapEntry:map.entrySet())
        {
            res.add(mapEntry.getValue());
        }
        return res;


    }

    public static String getKey(String str)
    {
        String key="";
        for(int i=1;i<str.length();i++)
        {
            char first=str.charAt(i-1);
            char second=str.charAt(i);
            int diff=first-second;
            // if it goes negative then we are adding 26
            if(diff<0)
            {
                diff+=26;
            }
            key+=diff+"#";
        }
        key+=".";
        return key;
    }

}
