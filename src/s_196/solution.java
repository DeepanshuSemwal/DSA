package s_196;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class solution {

    public static int minimumCostOfBreaking(int[] x, int[] y,int m,int n) {
        // code here
        Arrays.sort(x);
        Arrays.sort(y);
        reverse(x,m);
        reverse(y,n);
        int res=0;
        int horizontal_count=1;
        int vertical_count=1;
        int i=0;
        int j=0;
        while(i<m && j<n)
        {
            if(x[i]>=y[j])
            {
                res+=x[i]*vertical_count;
                horizontal_count+=1;
                i++;
            }
            else
            {
                res+=y[j]*horizontal_count;
                vertical_count+=1;
                j++;
            }
        }
        while(i<m)
        {
            res+=x[i]*vertical_count;
            i++;
        }
        while(j<n)
        {
            res+=y[j]*horizontal_count;
            j++;
        }

        return res;

    }

    public static void reverse(int arr[],int n)
    {
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

}
