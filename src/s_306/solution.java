package s_306;

import java.net.Inet4Address;
import java.util.*;

public class solution {

    static final int maxN=100000;
   static Vector<Integer>[]graph=new Vector[maxN];
   static int indegree[]=new int[maxN];
   static int job[]=new int[maxN];


    static void addEdge(int u,int v)
    {
        graph[u].add(v);
        indegree[v]++;
    }

    public static void TimeCount(int n,int m)
    {
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                queue.add(indegree[i]);
                job[i]=1;
            }
        }
        while(!queue.isEmpty())
        {
            int cur=queue.poll();
            for(int adj:graph[cur])
            {
                indegree[adj]--;
                if(indegree[adj]==0)
                {
                    job[adj]=1+job[cur];
                    queue.add(adj);
                }
            }

        }

    }
}
