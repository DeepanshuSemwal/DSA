package s_47;

import java.util.HashMap;

public class solution {

    // doubt
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer>map=new HashMap<>();
        int left = 0;
        int right = 0;
        int len=0;
        while (right < n)
        {
            if(map.containsKey(s.charAt(right)))
            {
                left=Math.max(map.get(right)+1,left);
            }
            map.put(s.charAt(right),right);
            len=Math.max(len,right-left+1);
            right++;
        }
        return len;


    }
}
