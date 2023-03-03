package s_78;

import java.util.ArrayList;

public class solution {

    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        // code here
        ArrayList<Integer>res=new ArrayList<>();
        int i=0,j=0,k=0;
        int prev1=Integer.MAX_VALUE;
        int prev2=Integer.MAX_VALUE;
        int prev3=Integer.MAX_VALUE;

        while(i<n1 && j<n2 && k<n3)
        {
            // for handling duplicates
            while(i<n1 && A[i]==prev1)
            {
                i++;
            }
            while(j<n2 && B[j]==prev2)
            {
                j++;
            }
            while (k<n3 && C[k]==prev3)
            {
                k++;
            }
            if(i<n1 && j<n2 && k<n3)
            {
                if(A[i]==B[j] && B[j]==C[k])
                {
                    res.add(A[i]);
                    prev1=A[i];
                    prev2=B[j];
                    prev3=C[k];
                    i++;
                    j++;
                    k++;
                }
                else if(A[i]<B[j])
                {
                    prev1=A[i];
                    i++;
                }
                else if(B[j]<C[k])
                {
                    prev2=B[j];
                    j++;
                }
                else
                {
                    prev3=C[k];
                    k++;
                }
            }
        }
        return res;

    }
}
