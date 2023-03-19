package rope_cutting_recusion;

public class solution {

    public  int maxRopeCut(int n, int a, int b,int c)
    {
        if(n==0)
        {
            return 0;
        }
        if(n<0)
        {
            return -1;
        }
        int res=Math.max(maxRopeCut(n-a,a,b,c),
                Math.max(maxRopeCut(n-b,a,b,c),maxRopeCut(n-c,a,b,c))

        );
        if(res == -1)
            return -1;

        return res + 1;



    }
}
