package array_sorted_recursion;

public class solution {

    public static boolean isSorted(int arr[],int n,int i)
    {
        if(i==n)
        {
            return true;
        }
        if(arr[i]<arr[i-1])
        {
            return false;
        }
      return isSorted(arr,n,i+1);

    }

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int n=arr.length;
        System.out.println(isSorted(arr,n,1));
    }
}
