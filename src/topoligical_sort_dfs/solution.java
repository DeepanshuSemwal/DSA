package topoligical_sort_dfs;

import java.util.ArrayList;
import java.util.Stack;

public class solution {


    static int[] topoSort(int V,ArrayList<ArrayList<Integer>> adj)
    {
        int res[]=new int[V];
        int index=0;
        boolean visited[]=new boolean[V];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                DfsRec(adj,V,i,visited,stack);
            }
        }
        while(!stack.isEmpty())
        {
            res[index]=stack.pop();
            index++;
        }
        return res;
    }

    public static void DfsRec(ArrayList<ArrayList<Integer>>adj, int V, int s, boolean[]visited, Stack<Integer>stack)
    {
        visited[s]=true;
        for(int v:adj.get(s))
        {
            if(visited[v]==false)
            {
                DfsRec(adj,V,v,visited,stack);
            }

        }
        stack.add(s);
    }
}
