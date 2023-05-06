package s_49;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>>res=new ArrayList<>();
        HashMap<HashMap<Character,Integer>,ArrayList<String>>bigMap=new HashMap<>();

      for(String str:strs)
      {
          HashMap<Character,Integer>freqMap=new HashMap<>();
          for(int i=0;i<str.length();i++)
          {
              char ch=str.charAt(i);
              if(freqMap.containsKey(ch))
              {
                  freqMap.put(ch, freqMap.get(ch)+1);
              }
              else
              {
                  freqMap.put(ch,1);
              }
          }
          if(!bigMap.containsKey(freqMap))
          {
              ArrayList<String>list=new ArrayList<>();
              list.add(str);
              bigMap.put(freqMap,list);
          }
          else
          {
              ArrayList<String>list=bigMap.get(freqMap);
              list.add(str);

          }
      }
        for(ArrayList<String> s:bigMap.values())
        {
            res.add(s);
        }
        return res;
        }
}
