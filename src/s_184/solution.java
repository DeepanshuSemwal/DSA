package s_184;

import java.util.Arrays;

public class solution {

    long findMinSum(int[] A,int[] B,int N) {

        long sum=0;
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0;i<N;i++)
        {
            sum+=Math.abs(A[i]-B[i]);
        }
        return sum;
    }
}
