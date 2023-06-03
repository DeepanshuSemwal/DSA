package Design_Data_Structure_perform_minMax_in_O1;

import java.util.ArrayDeque;

public class MyDs {

    ArrayDeque<Integer>dq=new ArrayDeque<>();
    public void insertMin(int x)
    {
        dq.offerFirst(x);
    }
    public void insertMax(int x)
    {
        dq.offerLast(x);
    }
    public int getMin()
    {
        return dq.peekFirst();
    }
    public int getMax()
    {
        return dq.peekLast();
    }
    public int extractMin()
    {
        return dq.pollFirst();
    }
    public int extractMax()
    {
        return dq.pollLast();
    }
}
