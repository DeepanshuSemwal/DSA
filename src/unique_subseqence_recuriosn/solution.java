package unique_subseqence_recuriosn;

import java.util.HashSet;

public class solution {

    public static void uniqueSubsequence(String str,String cur, int n, int i, HashSet<String>hs)
    {
        // for unique we use hashset

        if(i==n)
        {
            if(hs.contains(cur))
            {
                return;
            }
            else
            {
                System.out.println(cur);
                hs.add(cur);
                return;
            }
        }

        char cur_element=str.charAt(i);
        // include it
        uniqueSubsequence(str,cur+cur_element,n,i+1,hs);
        // not include it
        uniqueSubsequence(str,cur,n,i+1,hs);

    }

    public static void main(String[] args) {

        String str="aaa";
        int n=str.length();
        HashSet<String>hs=new HashSet<>();
        String cur="";
        int i=0;
        uniqueSubsequence(str,cur,n,i,hs);
    }


}
