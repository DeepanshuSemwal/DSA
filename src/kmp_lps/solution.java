package kmp_lps;

import java.util.Arrays;

public class solution {

    public static void lpsFill(String str,int[]lps)
    {
        int i=0;
        int len=0;
        int n=str.length();
        while(i<n)
        {
            if(str.charAt(i)== str.charAt(len))
            {
                lps[i]=len+1;
                len++;
                i++;
            }
            else
            {
                if(len==0)
                {
                    lps[i]=0;
                }
                else
                {
                    len=lps[len-1];
                }
            }
        }
    }

    public void kmp(String str,String pattern)
    {
        int i=0;
        int n=str.length();
        int m=pattern.length();
        int lps[]=new int[m];
        lpsFill(pattern,lps);
        int j=0;
        while(i<n)
        {
            if(str.charAt(i)==pattern.charAt(i))
            {
                i++;
                j++;
            }
            if(j==m)
            {
                System.out.println(i-j);
                j=lps[j-1];

            }
            else if(i<n && pattern.charAt(i)!=str.charAt(i))
            {
                if(j==0)
                {
                    i++;
                }
                else
                {
                    j=lps[j-1];
                }

            }
        }
    }
}
