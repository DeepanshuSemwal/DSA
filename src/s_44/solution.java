package s_44;

public class solution {

    public String longestCommonPrefix(String[] strs) {

        String res=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            res=helper(res,strs[i]);
        }
        return res;
    }

    // it will find common in two Strings
    public String helper(String str1,String str2)
    {
        int n=Math.min(str1.length(),str2.length());
        String res="";
        for(int i=0;i<n;i++)
        {
            if(str1.charAt(i)==str2.charAt(i))
            {
                res+=str1.charAt(i);
            }
            else
            {
                break;
            }
        }
        return res;
    }
}
