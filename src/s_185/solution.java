package s_185;

import java.util.Arrays;

public class solution {

    static int maxLevel(int []boxes, int n)
    {
        int res=1;
        Arrays.sort(boxes);
        int prev_width=boxes[0];
        int prev_count=0;
        int cur_width=0;
        int cur_count=0;
        for(int i=1;i<n;i++)
        {
          cur_width+=boxes[i];
          cur_count+=1;
          if(cur_width>prev_width && cur_count>prev_count)
          {
              prev_width=cur_width;
              prev_count=cur_count;
              cur_count=0;
              prev_width=0;
              res++;
          }
        }
        return res;
    }
}
