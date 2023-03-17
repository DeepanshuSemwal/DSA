package sum_of_digit_recursion;

public class solution {
    // sum of digits using recursion
    public static int getsum(int n)
    {
        if(n==0)
        {
            return 0;
        }
       return getsum(n/10)+n%10;
    }
}
