package s_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class solution {
    public static String reverseWord(String str)
    {
        // Reverse the string str
        char[]arr=str.toCharArray();
        String res="";

        int low=0;
        int high=str.length()-1;
        while(low<high)
        {
            char temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;

        }
        res = String.valueOf(arr);
        return res;

    }
}
