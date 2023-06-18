package square_root;

public class solution {

    // navie approach
    public static int sqaureRoot(int x)
    {
        int i=1;
        while(i*i<=x)
        {
            i++;
        }
        return i-1;
    }

    // efficent approach

    public static int sqaureRoot2(int x)
    {
        int low=1;
        int high=x;
        int res=0; // to store the nearest value for numbers like 10,11, 13, etc.
        while(low<=high)
        {
            int mid=(low+high)/2;
            int sq=mid*mid;
            if(sq==x)
            {
                return mid;
            }
            else if(sq>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
                res=low;
            }

        }
        return low;
    }

    public static void main(String[] args) {

        int res=sqaureRoot(10);
        System.out.println(res);
    }
}
