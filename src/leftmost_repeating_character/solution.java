package leftmost_repeating_character;

public class solution {

    // navie approach
    public static int leftMostRepteaing(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            for(int j=i+1;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    return i;
                }
            }
        }
        return -1;

    }
    static int CHAR=256;
    public static int leftMostRepeating(String str)
    {
        boolean visited[]=new boolean[CHAR];
        // traverse from the right side and check whether the charcter is visited or not
        int res=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(visited[str.charAt(i)])
            {
                res=i;
            }
            else
            {
                visited[str.charAt(i)]=true;
            }
        }
        return res;
    }
}
