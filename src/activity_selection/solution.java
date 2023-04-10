package activity_selection;

import java.util.Arrays;
import java.util.Comparator;

public class solution {


    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        int res=1;
        int activity[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            activity[i][0]=start[i];
            activity[i][1]=end[i];
        }
        Arrays.sort(activity, Comparator.comparingDouble(o->o[1]));
        int prev=0;
        for(int cur=1;cur<n;cur++)
        {
            if(activity[cur][0]>activity[prev][1]) // we do only to pas test cases else we do if
            {
                res++;
                prev=cur;

            }
        }

        return res;
    }
}
