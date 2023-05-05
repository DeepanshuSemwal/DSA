package s_47;

import java.util.HashMap;
import java.util.HashSet;

public class solution {

    // doubt
    public int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int i=0;
        int j=0;
        int res=0;
        HashSet<Character>set=new HashSet<>();
        while(j<n)
        {
            char ch=s.charAt(j);
            while(set.contains(ch))
            {
                set.remove(s.charAt(i));
                i++;
            }
            set.add(ch);
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;


    }
}
