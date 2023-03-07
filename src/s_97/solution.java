package s_97;

import java.util.Arrays;

public class solution {
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M)
        {
            return -1;
        }
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum+=A[i];
            max=Math.max(max,A[i]);
        }
        int low=max,high=sum,res=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(allocation_ispossible(A,N,M,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
    public static boolean allocation_ispossible(int A[],int N,int M, int barrier){
        int allocated_student=1,pages=0;
        for(int i=0;i<N;i++){
            if(pages+A[i]>barrier){
                allocated_student+=1;
                pages=A[i];
            }
            else{
                pages+=A[i];
            }
        }
        return (allocated_student<=M);
    }
}
