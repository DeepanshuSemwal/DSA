package least_prime_factor;

import java.util.Arrays;

public class solution {

    //sevie algorithm
    public static void Seive(int n)
    {
        boolean arr[] = new boolean[n];
        Arrays.fill(arr, true);
        for (int i = 2; i <= n; i++)
        {
            if (arr[i] == true)
            {
                System.out.println(i);
                for (int j = 2 * i; j <= n; j = j + i)
                {
                    arr[j] = false;
                }
            }
        }
    }

    // pod
    public int[] leastPrimeFactor(int n)
    {
        // code here
        int res[] = new int[n + 1];
        Arrays.fill(res, 0); // 0 means true
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            if (res[i] == 0) {
                res[i] = i;
                for (int j = 2 * i; j <= n; j = i + j) {
                    if (res[j] == 0) {
                        res[j] = i;
                    }
                }
            }
        }
        return res;

    }
}
