package fractional_knapsack;

import java.util.Arrays;
import java.util.Comparator;

class Item
{
    int value;
    int weight;
    Item(int x,int y)
    {
        this.value=x;
        this.weight=y;
    }
}
public class solution {

    double fractionalKnapsack(int W, Item arr[], int n)
    {
        // Your code here
        // val is profit
        // weight is weight
        // W is capacity
        double res=0.0;
        double ans[][]=new double[n][3];
        for(int i=0;i<n;i++)
        {
            ans[i][0]=arr[i].weight;
            ans[i][1]=arr[i].value;
            ans[i][2]=ans[i][1]/ans[i][0]; //profit by weight
        }
        Arrays.sort(ans, Comparator.comparingDouble(o->o[2]));
        for(int i=ans.length-1;i>=0;i--)
        {
            if(ans[i][0]<=W)
            {
                W-=ans[i][0];
                res+=ans[i][1]; // adding profit
            }
            else
            {
                res+=ans[i][1]*(W/ans[i][0]);
                break;
            }
        }
        return res;

    }
}
