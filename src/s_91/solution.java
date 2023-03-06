package s_91;

public class solution {

    // Check if reversing a sub array make the array sorted
     // Input : arr [] = {1, 2, 5, 4, 3}
    // Output : Yes
    //Input : arr [] = { 1, 2, 4, 5, 3 }
    //Output : No

    // efficient approach
   public static boolean isSorted(int arr[],int n)
   {
       int x=-1;
       int y=-1;
       for(int i=0;i<n-1;i++)
       {
           if(arr[i]>arr[i+1])
           {
               if(x==-1)
               {
                   x=i;
               }
               y=i+1;
           }
       }
       // if(x=-1) it means array is already sorted ,so we dont need to do anything
       if(x!=-1)
       {
           reverse(arr,x,y);
           for(int i=0;i<n-1;i++)
           {
               if(arr[i]>arr[i+1])
               {
                   return false;
               }
           }
       }
       return true;
   }
   public static void reverse(int arr[],int low,int high)
   {
       while(low<high)
       {
           int temp=arr[low];
           arr[low]=arr[high];
           arr[high]=temp;
           low++;
           high--;
       }

   }



}
