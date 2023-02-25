package s_19;

public class solution {
    public int maxProfit(int[] prices) {

        int max_profit=0;
        int min_sofar=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            min_sofar=Math.min(min_sofar,prices[i]);
            max_profit=Math.max(max_profit,prices[i]-min_sofar);
        }
        return max_profit;
    }
}
