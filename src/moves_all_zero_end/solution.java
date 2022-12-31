package moves_all_zero_end;

public class solution {

    // move all zeroes to the end of the array
    // [0707078]
    // o/p: [7778000]

    public static void sol(int arr[],int n)
    {
        // navie
//        for(int i=0;i<n;i++)
//        {
//            if(arr[i]==0)
//            {
//                for(int j=i+1;j<n;j++)
//                {
//                    if(arr[j]!=0)
//                    {
//                        int temp=arr[i];
//                        arr[i]=arr[j];
//                        arr[j]=temp;
//                    }
//                }
//            }
//        }

        // efficient
        for(int i=0;i<n;i++)
        {
            int count=0;
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }


    }
}
