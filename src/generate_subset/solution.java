package generate_subset;

public class solution {
    public static void subSet(String s,String cur,int i)
    {
        i=0;
        cur="";
        int n=s.length();
        if(i==n)
        {
            return;
        }
        // include
        subSet(s,cur+s.charAt(i),i+1);
        // not included
        subSet(s,cur,i+1);
    }

}
