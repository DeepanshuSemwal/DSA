package merge_k_sorted_arrays;


import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Triplet implements Comparable<Triplet>
{
    int value;
    int arrayPos;
    int valuePos;
    Triplet(int v,int ap,int vp)
    {
        value=v;
        arrayPos=ap;
        valuePos=vp;
    }

    @Override
    public int compareTo(Triplet t) {

        if(value<=t.value)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
}
public class solution {

    public static List<Integer> mergeArr(ArrayList<ArrayList<Integer> > arr)
    {
        ArrayList<Integer>res=new ArrayList<>();
        PriorityQueue<Triplet>pq=new PriorityQueue<>();
        for(int i=0;i<arr.size();i++)
        {
            pq.add(new Triplet(arr.get(i).get(0),i,0));
        }
        while (!pq.isEmpty())
        {
            Triplet cur=pq.poll();
            res.add(cur.value);
            int ap=cur.arrayPos;
            int vp=cur.valuePos;
            if(vp+1<arr.get(ap).size())
            {
                pq.add(new Triplet(arr.get(ap).get(vp+1),ap,vp+1));
            }
        }
        return res;

    }



}
