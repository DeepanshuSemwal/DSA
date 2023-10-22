package job_scheduling_problem;


import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

public class solution {

    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        // sort the array in decreasing order according to profit
        int res[]=new int[2];
        boolean slot[]=new boolean[n];
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        int job_id=0;
        int profit=0;
        for(int i=0;i<n;i++)
        {
            int deadline=arr[i].deadline;
            while (deadline>=1)
            {
                if(slot[deadline-1]==false)
                {
                    slot[deadline-1]=true;
                    profit+=arr[i].profit;
                    job_id++;
                    break;
                }
                deadline--;
            }
        }
        res[0]=job_id;
        res[1]=profit;
        return res;




    }
}
