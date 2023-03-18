package tower_hanoi;

public class solution {

    public static void toh(int n,char a,char b,char c)
    {
        // base case
        if(n==1)
        {
            System.out.print("move"+n+"from"+a+ "to"+ c);
            return;
        }
        toh(n-1,a,c,b);
        System.out.println("move"+n+"from"+a+ "to"+ b);
        toh(n-1,b,a,c);


    }
}
