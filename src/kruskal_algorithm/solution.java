package kruskal_algorithm;


import java.util.Collections;
import java.util.Comparator;

class Edge implements Comparable<Edge>
{
    int src,dest,wt;
    Edge(int src,int dest,int wt)
    {
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
    public int compareTo(Edge edge)
    {
        return this.wt- edge.wt;
    }
}

public class solution {

    static int[]p,rank[];
    static void union(int x,int y)
    {
        int rx=find(x);
        int ry=find(y);
        if(rx==ry)
        {
            return;
        }
        p[ry]=rx;

    }
    static int find(int x)
    {
        if(p[x]==x)
        {
            return x;
        }
        return p[x];
    }




    
}
