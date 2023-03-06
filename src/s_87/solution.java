package s_87;

import java.util.ArrayList;
import java.util.List;

public class solution {
    // Input : n = 7 and array[] = {1, 2, 3, 6, 3, 6, 1}
    // Output: 1, 3, 6

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>res=new ArrayList<>();

        int index=0;
        for(int i=0;i<n;i++)
        {
            index=arr[i]%n;
            arr[index]+=n;
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]/n>=2)
            {
                res.add(i);
            }
        }
        if(res.size()==0)
        {
            res.add(-1);
            return res;
        }
        return res;

    }
}
