package circular_tour;

import java.util.ArrayDeque;

public class solution {

    // navie
    int tour1(int petrol[], int distance[])
    {
        // Your code here
        int end =0;
        int balance=0;
        int n=petrol.length;
       for(int start=0;start<n;start++)
       {
           while(true)
           {
               balance+=petrol[end]-distance[end];
               if(balance<0)
               {
                   break;
               }
               end=(end+1)%n;
               if(end==start)
               {
                   return start+1;
               }
           }
       }
       return -1;

    }

    int tour(int petrol[], int distance[])
    {
        int n=petrol.length;
        int start=0;
        int balance=0;
        int defcient=0;// kami
        for(int i=0;i<n;i++)
        {
            balance+=petrol[i]-distance[i];
            if(balance<0)
            {
                defcient+=balance;
                start=i+1; // we are doing i+1 becuase we need to return position
                balance=0;
            }
        }
        if(balance+defcient>=0)
        {
            return start;
        }
        else
        {
            return -1;
        }
    }


}
