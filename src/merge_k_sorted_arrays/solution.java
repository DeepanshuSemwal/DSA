package merge_k_sorted_arrays;



import java.util.*;


class Triplet
{
    int value;
    int arrPos;
    int valPos;
    Triplet(int val,int ap,int vp)
    {
        value=val;
        arrPos=ap;
        valPos=vp;
    }

}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K)
    {
        // Write your code here.
        ArrayList<Integer>res=new ArrayList<>();
        PriorityQueue<Triplet>pq=new PriorityQueue<>(new Comparator<Triplet>() {
            @Override
            public int compare(Triplet o1, Triplet o2) {
                return o1.value-o2.value;
            }
        });
        for(int i=0;i<K;i++)
        {
            pq.add(new Triplet(arr[i][0],i,0));
        }
        while(!pq.isEmpty())
        {
            Triplet cur=pq.poll();
            int value=cur.value;
            int ap=cur.arrPos;
            int vp=cur.valPos;
            res.add(value);
            if(vp+1<arr.length)
            {
                pq.add(new Triplet(arr[ap][vp+1],ap,vp+1));
            }
        }
        return res;


    }

}

