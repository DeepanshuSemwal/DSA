package s_275;

import java.util.HashMap;
import java.util.Map;

public class solution {

    public void route(HashMap<String ,String>map)
    {
        HashMap<String,String >reverseMap=new HashMap<>();
        for(Map.Entry<String,String> mapEntry:map.entrySet())
        {
            reverseMap.put(mapEntry.getValue(), mapEntry.getKey());
        }
        String start="";
        String to="";
        for(Map.Entry<String,String>mapEntry:map.entrySet())
        {
            if(!reverseMap.containsKey(mapEntry.getKey()))
            {
                start=mapEntry.getKey();
                break;
            }
        }
        if(start==null)
        {
            System.out.println("Invalid");
        }
        to=map.get(start);
        while(to!=null)
        {
            System.out.print(start+"->"+to);
            start=to;
            to=map.get(start);
        }


    }
}
