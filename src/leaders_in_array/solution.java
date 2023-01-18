package leaders_in_array;

public class solution {

    public static void leaders(int arr[],int n)
    {
        int cur_leader=arr[n-1];
        System.out.println(cur_leader);
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]>cur_leader)
            {
                cur_leader=arr[i];
                System.out.println(cur_leader);
            }
        }
    }
    public static void main(String[] args) {

    }
}
