package kausa_raju_algorithm;

import java.util.ArrayList;
import java.util.Stack;

public class solution {

    public int kosaraju(int V, ArrayList<ArrayList<Integer>> adj)
    {
        //code here
        Stack<Integer> st = new Stack<>();
        int[] vis = new int[V];
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                topoSort(i, adj, vis, st);
            }
        }

        ArrayList<ArrayList<Integer>> transpose = new ArrayList<>();

        for(int i = 0; i < V; i++){
            transpose.add(new ArrayList<>());
        }

        for(int i = 0; i < V; i++){
            vis[i] = 0;
            for(int n : adj.get(i)){
                transpose.get(n).add(i);
            }
        }

        int count = 0;

        while(!st.isEmpty()){
            int node = st.pop();
            if(vis[node] == 0){
                count++;
                dfs(node, transpose, vis);
            }
        }

        return count;
    }

    public void topoSort(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, Stack<Integer> st){
        vis[node] = 1;

        for(int n : adj.get(node)){
            if(vis[n] == 0){
                topoSort(n, adj, vis, st);
            }
        }

        st.push(node);
    }

    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis){
        vis[node] = 1;

        for(int n : adj.get(node)){
            if(vis[n] == 0){
                dfs(n, adj, vis);
            }
        }
    }
}

