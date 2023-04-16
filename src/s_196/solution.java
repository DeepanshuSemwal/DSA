package s_196;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class solution {

    public  int paper_cut(int []x,int[] y)
    {
        Arrays.sort(x);
        Arrays.sort(y);
        reverse(x);
        reverse(y);
        int n=x.length;
        int m=y.length;
        int i=0;
        int j=0;
        int horizontal_count=1;
        int vertical_count=1;
        int res=0;
        while(i<n &&j<m)
        {
            if(x[i]>y[j])
            {
                res+=x[i]*vertical_count;
                horizontal_count++;
                i++;
            }
            else
            {
                res+=y[j]*horizontal_count;
                vertical_count++;
                j++;
            }
        }
        while(i<n)
        {
            res+=x[i]*vertical_count;
            i++;
        }
        while(j<m)
        {
            res+=y[j]*horizontal_count;
            j++;
        }
        return res;


    }
    public void reverse(int arr[])
    {
        int i=0;
        int j=arr.length-1;
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
