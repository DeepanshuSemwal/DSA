package s_187;

public class solution {

    public static int maxEqualSum(int N1,int N2,int N3, int[] S1, int[] S2, int[] S3) {
        // code here
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int top1=0;
        int top2=0;
        int top3=0;
        int max_sum=0;
        for(int i=0;i<N1;i++)
        {
            sum1+=S1[i];
        }
        for(int i=0;i<N2;i++)
        {
            sum2+=S2[i];
        }
        for(int i=0;i<N3;i++)
        {
            sum3+=S3[i];
        }
        while(sum1>0 && sum2>0 && sum3>0)
        {
            int min=Math.min(sum1,Math.min(sum2,sum3));
            while(sum1>min)
            {
                sum1-=S1[top1];
                top1++;
            }
            while(sum2>min)
            {
                sum2-=S2[top2];
                top2++;
            }
            while(sum3>min)
            {
                sum3-=S3[top3];
                top3++;
            }
            if(sum1==sum2 && sum1==sum3)
            {
                max_sum=sum1;
                break;
            }

        }
        return max_sum;
    }
}
