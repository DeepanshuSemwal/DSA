package s_191;


import java.util.Arrays;

class Pair
{
    int x;
    int y;

    public Pair(int a, int b)
    {
        x = a;
        y = b;
    }
}

public class solution {

    int maxChainLength(Pair arr[], int n)
    {
        // your code here
       // sort according to second element in increasing order
        Arrays.sort(arr,(a,b)->a.y-b.y);
        int max_length=1;
        int previous_Pair =arr[0].y;
        for(int i=1;i<n;i++)
        {
            int cur_Pair=arr[i].x;
            if(previous_Pair<cur_Pair)
            {
                max_length++;
                previous_Pair=arr[i].y;
            }
        }
        return max_length;
    }
}
