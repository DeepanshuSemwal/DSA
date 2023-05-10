package rabin_karp_algorithm;

public class solution {

    static int d=256;
    static int q=101;
    public static void rabinKarp(String txt,String pattern)
    {
        int n=txt.length();
        int m=pattern.length();
        // compute d^(m-1)%q
        int h=1;
        for(int i=0;i<m;i++)
        {
            h=(h*d)%q;
        }

        // compute p and t
        int p=1,t=1;
        for(int i=0;i<m;i++)
        {
            p=(p*d+pattern.charAt(i))%q;
            t=(t*d+pattern.charAt(i))%q;
        }

        for(int i=0;i<m-n;i++)
        {
            // check for hits
            if(p==t)
            {
                boolean flag=true;
                for(int j=0;j<m;j++)
                {
                    if(txt.charAt(i+j)!=pattern.charAt(j))
                    {
                        flag=false;
                        break;
                    }
                }
                if(flag==true)
                {
                    System.out.println(i+" ");
                }
            }
            if(i<n-m)
            {
                t=((t-txt.charAt(i)*h)*d+txt.charAt(i+m))%q;
            }

            if(t<0) // if we are getting negative number q helps us to make it positive
            {
                t=t+q;
            }
        }


    }
}
