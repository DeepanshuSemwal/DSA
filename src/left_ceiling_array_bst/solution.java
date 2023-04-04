package left_ceiling_array_bst;

import com.sun.source.tree.Tree;

import java.time.temporal.Temporal;
import java.util.TreeMap;
import java.util.TreeSet;

public class solution {

    public static void leftCeiling(int arr[], int n) {
        System.out.print("-1"+" "); // left element will always be -1
        TreeSet<Integer> set = new TreeSet<>();
        set.add(arr[0]);

        for(int i = 1; i <n; i++) {
            if (set.ceiling(arr[i])!=null) {
                System.out.print(set.ceiling(arr[i])+" ");
            }
            else {
                System.out.print("-1"+" ");
            }
            set.add(arr[i]);
        }


    }

    public static void main(String[] args) {
        int arr[]={2,8,30,15,25,12};
        leftCeiling(arr,arr.length);
    }
}
