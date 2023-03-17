package pallindrome_recusion;

public class solution {

    int isPalindrome(String s) {
        // code here
        int start=0;
        int end=s.length()-1;
        return help(s,start,end);
    }

    public int help(String s,int start,int end) {
        int n=s.length();
        if(n==0 || n==1)
        {
            return 1;
        }
        if(start>=end)
        {
            return 1;
        }
        if(s.charAt(start)!=s.charAt(end))
        {
            return 0;
        }


        return  help(s,start+1,end-1);

    }

}
