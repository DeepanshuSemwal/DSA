package s_194;

public class solution {


    //Time Complexity: O(log(min(a,b)))
    //Auxiliary Space: O(1)
    //
    //Note that the above Greedy solution doesn’t always produce an optimal result. For example, if the input is 36 x 30, the above algorithm would produce output 6, but we can cut the paper into 5 squares
    //1) Three squares of size 12 x 12
    //2) Two squares of size 18 x 18
    static int minimumSquare(int a, int b)
    {
        if(a<b)
        {
            a=b;
        }
        int result=0;
        int remainder=0;
        while(b>0)
        {
            result+=a/b;
            remainder=a%b;
            a=b;
            b=remainder;
        }
        return result;
    }
}
