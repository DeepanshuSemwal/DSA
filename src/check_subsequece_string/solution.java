package check_subsequece_string;

public class solution {

    public static boolean subsequence(String s1,String s2)
    {
        int n1=s1.length();
        int n2=s2.length();
        if(n2>n1)
        {
            return false;
        }
       int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(s1.charAt(i)==s2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        return j==n2;
    }
}
