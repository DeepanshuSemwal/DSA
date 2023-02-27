package s_31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {

    public int[][] overlappedInterval(int[][] Intervals)
    {
        // Code here
        List<int[]>res=new ArrayList<>();
        if(Intervals.length==0 || Intervals==null)
        {
            return res.toArray(new int[0][]);
        }
        Arrays.sort(Intervals,(a,b)->a[0]-b[0]);
        int start=Intervals[0][0];
        int end=Intervals[0][1];
        for (int i[]:Intervals)
        {
            if(i[0]<=end)
            {
                end=Math.max(end,i[1]);
            }
            else
            {
                res.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }

        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
