package longest_subsequence_with_k_uniquehcarcter;

import java.util.HashMap;

public class solution {

    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int j=0;
        int n=s.length();
        int res=-1;
        while(j<n)
        {
            char ch=s.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
            if(map.size()<k)
            {
                j++;
            }
            else if(map.size()==k)
            {
                res=Math.max(res,(j-i+1)) ;// window length : j-i+1
                j++;
            }
            else if(map.size()>k)
            {
                while(map.size()>k)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    }
                    if(map.get(s.charAt(i))==0)
                    {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return res;
    }
}


