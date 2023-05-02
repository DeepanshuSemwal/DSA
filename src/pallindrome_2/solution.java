package pallindrome_2;

public class solution {

    public boolean validPalindrome(String s)
    {
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return isPallindrome(s,i+1,j) || isPallindrome(s,i,j-1);
            }
        }
        return true;
    }

    public boolean isPallindrome(String s,int i,int j)
    {

        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
