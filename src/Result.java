import org.w3c.dom.Node;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}
class Result
{
    static String largestNumber(int n, int sum)
    {
        // add your code here
        String res="";
        while(n-->0)
        {
            if(sum>=9)
            {
                res.concat("9");
                sum-=9;
            }
            else if(sum<9)
            {
                res.concat(String.valueOf(sum));
            }
        }
        if(res==String.valueOf(sum))
        {
            return res;
        }
        return "-1";

    }

public static ListNode seg(ListNode head)
{
    ListNode evenDummy=new ListNode(-1);
    ListNode EvenTail=evenDummy;
    ListNode oddDummy=new ListNode(-1);
    ListNode oddTail=oddDummy;
    ListNode cur=head;
    while(cur!=null)
    {
        if(cur.data%2!=0)
        {
            oddTail.next=cur;
            oddTail=oddTail.next;
        }
        else
        {
            evenTail.next=cur;
            evenTail=evenTail.next;
        }
    }
    oddTail.next=evenDummy.next;
    evenTail.next=null;
    return oddDummy.next;

}





}