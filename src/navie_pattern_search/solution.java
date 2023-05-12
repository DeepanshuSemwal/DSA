package navie_pattern_search;

public class solution {



    // my solution

    static boolean search(String pat, String txt)
    {
        // Your code here
        int m=pat.length();
        int n=txt.length();
        int i=0;
        int j=0;
        while(i<n && j<m)
        {
            if(pat.charAt(j)==txt.charAt(i))
            {
                i++;
                j++;
            }
            else
            {
                j=0;
                if(pat.charAt(j)!=txt.charAt(i))
                {
                    i++;
                }
            }
        }
        return j==m;

    }


    public static void naviePattern(String text,String pattern)
    {
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(text.charAt(i+j)!=pattern.charAt(j))
                {
                    break;
                }
            }
            if(j==m)
            {
                System.out.println(i+" ");
            }

        }
    }
}
