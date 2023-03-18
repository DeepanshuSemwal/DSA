package print_string_in_reverse;

public class solution {
    public static void reverse(String str,int n,int i)
    {
        // 1. using two pointer
        // 2. using recursion

        // abc
        // o/p: cba
       // i=str.length()-1;

        if(i==0)
        {
            System.out.print(  str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i)+" ");
        reverse(str,n-1,i-1);


    }

    public static void main(String[] args) {
        String str="abcd";
        int n=str.length();
        int i=str.length()-1;
        reverse(str,n,i);
    }
}
