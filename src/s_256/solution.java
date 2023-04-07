package s_256;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        // greedy solution

        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int n = intervals.length;
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < n) {
            if (intervals[left][1] <= intervals[right][0]) // no overlapping  [1,8] [9,10]
            {
                left = right;
                right += 1;
            } else if (intervals[left][1] <= intervals[right][1]) // overlapping case 2 : [1,8][5,10]
            {
                // remove right
                count += 1;
                right += 1;
            } else if (intervals[left][1] > intervals[right][1])// overlapping case 3: [1,10][1,2]
            {
                // remove left
                count += 1;
                left = right;
                right += 1;
            }
        }
        return count;

    }
}
