package s_89;

public class solution {

    public static void product(int arr[],int n)
    {
        int res=1;
        int product[]=new int[n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    continue;
                }
                res*=arr[j];

            }
            product[i]=res;
            res=1;

        }
        for(int i=0;i<product.length;i++)
        {
            System.out.print(product[i]+" ");
        }
    }

    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long[]left=new long[n];
        int product=1;
        for(int i=0;i<n;i++)
        {
            product*=nums[i];
            left[i]=product;
        }
        product=1;
        for(int i=n-1;i>0;i--)
        {
            left[i]=left[i-1]*product;
            product*=nums[i];
        }
        left[0]=product;
        return left;

    }

    public static long[] productExceptSelf2(int nums[], int n)
    {
        // code here
        long[]left=new long[n];
        long []right=new long[n];
        long product[]=new long[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=1;i<n;i++)
        {
            left[i]=(long)(left[i-1]*nums[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i]=(long)(right[i+1]*nums[i+1]);
        }
        for(int i=0;i<n;i++)
        {
            product[i]=left[i]*right[i];
        }
        return product;


    }

    public static void main(String[] args) {
        int arr[]  = {10, 3, 5, 6, 2};
        int n=arr.length;
        product(arr,n);
    }
}
