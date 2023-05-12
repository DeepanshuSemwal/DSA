package string_rotation;

public class solution {

    public static boolean checkRoatation(String s1,String s2)
    {
        String s3=s1+s1;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        return s3.indexOf(s2)>=0;
    }


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
}

