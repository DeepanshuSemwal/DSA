package permutation_recursion;

public class solution {

    public static void permute(String str,int i)
    {
        if(i==str.length()-1)
        {
            return;
        }
        else
        {
            for(int j=i;j<str.length();j++)
            {
                // fix one charcter and then swaps
                swap(str,i,j);
                permute(str,i+1);
                swap(str,i,j); // to get original string so that in above step we swap next characters


            }
        }
    }
    public static void swap(String str,int i,int j)
    {
        char[]charArray=str.toCharArray();
        char temp=charArray[i];
        charArray[i]=charArray[j];
        charArray[j]=temp;

    }

    public static void main(String[] args) {

    }
}
