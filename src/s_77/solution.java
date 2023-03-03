package s_77;

public class solution {
    public static String countSort(String arr)
    {
        // code here
        String ans="";
        int k=26;
        int n =arr.length();
        int[]count=new int[k];

        char[]temp=arr.toCharArray();
        for(int i=0;i<k;i++)
        {
            count[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            count[count[i]]++;
        }
        for(int i=1;i<k;i++)
        {
            count[i]=count[i-1]+count[i];
        }
        char output[]=new char[n];
        for(int i=n-1;i>=0;i--)
        {
            output[count[temp[i]-1]]=temp[i];
            count[temp[i]]--;
        }
        for(int i=0;i<n;i++)
        {
            temp[i]=output[i];
        }
        ans=String.valueOf(temp);
        return ans;

    }
}
