package s_48;

import java.util.HashMap;

public class solution {

    public int characterReplacement(String s, int k) {

        int right=0;
        int left=0;
        int n=s.length();
        int len=0;
        int maxFreq=0;
        // len=right-left+1
        // to check whether is window applicable or not =(right-left+1)-maxFreq

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
       while(right<n)
       {
           {

               char ch=s.charAt(right);
               if(map.containsKey(ch))
               {
                   map.put(ch,map.get(ch)+1);
               }
               else
               {
                   map.put(ch,1);
               }
               maxFreq = Math.max(maxFreq, map.get(s.charAt(right)));

               // if window is not applicable then we have to shrink the size of the window
               // len - maxFreq <= K : window is applicable
               while ((right - left + 1) - maxFreq > k) {
                   // shrink
                   map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                   left++;
               }

               len = Math.max(len, right - left + 1);
               right++;
           }
       }

        return len;


    }

}
