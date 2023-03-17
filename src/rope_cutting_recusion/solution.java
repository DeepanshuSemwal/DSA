package rope_cutting_recusion;

public class solution {

    public  int maxRopeCut(int n, int a, int b,int c)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return -1;
        }
        return Math.max(maxRopeCut(n-a,a,b,c),
                Math.max(maxRopeCut(n-b,a,b,c),maxRopeCut(n-c,a,b,c))
        );

    }
}
