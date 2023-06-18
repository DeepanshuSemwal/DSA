package number_of_occurences;

public class solution {

    // navie
    public static int numberOfOccurences(int arr[],int n,int x)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }

    public static int numberOfOccurences2(int arr[],int n,int x)
    {
        int firstOccurence=findFirstOccurence(arr,n,x);
        int lastOccurence=findLasttOccurence(arr,n,x);
        return (lastOccurence-firstOccurence+1);
    }
    public static int findFirstOccurence(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(arr[mid]!=arr[mid-1] || mid==0)
                {
                    return mid;
                }
                else
                {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static int findLasttOccurence(int arr[],int n,int x)
    {
        int low=0;
        int high=n-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>x)
            {
                high=mid-1;
            }
            else if(arr[mid]<x)
            {
                low=mid+1;
            }
            else
            {
                if(arr[mid]!=arr[mid+1] || mid==n-1)
                {
                    return mid;
                }
                else
                {
                    low=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[]={10,20,20,20,30};
        int n=arr.length;
        int x=20;
        int res=numberOfOccurences2(arr,n,20);
        System.out.println(res);
    }


}
