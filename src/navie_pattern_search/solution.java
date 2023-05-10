package navie_pattern_search;

public class solution {

    public static void naviePattern(String text,String pattern)
    {
        int n=text.length();
        int m=pattern.length();
        for(int i=0;i<n-m;i++)
        {
            int j;
            for(j=0;j<m;j++)
            {
                if(text.charAt(i)!=pattern.charAt(j))
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
