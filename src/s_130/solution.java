package s_130;

public class solution {
    static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data=x;
            next=null;
        }

    }

    public long multiplyTwoLists(Node l1,Node l2){
        //add code here.
        long num1=0;
        long num2=0;
        long N=1000000007;
        while(l1!=null || l2!=null)
        {
            // generrate the didgits from the linkdlist and multiply the numbers
            if(l1!=null)
            {
                num1=(num1*10)%N+l1.data;
                l1=l1.next;
            }
            if(l2!=null)
            {
                num2=num2*10+l2.data;
                l2=l2.next;
            }

        }
        return ((num1%N)*(num2%N))%N;

    }
}
