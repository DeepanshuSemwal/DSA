package number_coins;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution {

    static List<Integer> minPartition(int amount)
    {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int arr[]= {2000,500,200,100,50,20,10,5,2,1};
        for(int i=0;i<arr.length;i++)
        {
            while(arr[i]<=amount)
            {
                amount-=arr[i];
                al.add(arr[i]);
            }
        }
        return al;

    }
}
