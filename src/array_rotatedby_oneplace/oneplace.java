package array_rotatedby_oneplace;

public class oneplace {

    public static void main(int arr[],int n)
    {
        int temp=arr[0];
        for(int i=1;i<n;i++)
        {
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;

    }

    public static void main(String[] args) {

    }
}
