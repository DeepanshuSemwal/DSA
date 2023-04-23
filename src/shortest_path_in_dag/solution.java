package shortest_path_in_dag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class solution {

}



class Pair{

    int dest;

    int wt;

    Pair(int dest,int wt){

        this.dest=dest;

        this.wt=wt;

    }

}

class Solution {

    public void topoSort(ArrayList<ArrayList<Pair>> adj, int vis[], Stack<Integer> st, int node){

        vis[node]=1;

        for(int i=0;i<adj.get(node).size();i++){

            int temp=adj.get(node).get(i).dest;

            if(vis[temp]==0){

                topoSort(adj,vis,st,temp);

            }

        }

        st.add(node);

    }



    public int[] shortestPath(int N,int M, int[][] edges) {

        //Code here

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();

        for(int i=0;i<N;i++){

            adj.add(new ArrayList<Pair>());

        }

        for(int i=0;i<M;i++){

            int u=edges[i][0];

            int v=edges[i][1];

            int wt=edges[i][2];

            adj.get(u).add(new Pair(v,wt));

        }

        int vis[]=new int[N];

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<N;i++){

            if(vis[i]==0){

                topoSort(adj,vis,st,i);

            }

        }

        int dis[]=new int[N];

        Arrays.fill(dis,1000000);

        dis[0]=0;

        while(!st.isEmpty()){

            int node=st.peek();

            st.pop();

            for(int i=0;i<adj.get(node).size();i++){

                int v=adj.get(node).get(i).dest;

                int wt=adj.get(node).get(i).wt;

                if(dis[node]+wt<dis[v]){

                    dis[v]=dis[node]+wt;

                }

            }



        }

        for(int i=0;i<N;i++){

            if(dis[i]>=1000000)

                dis[i]=-1;

        }

        return dis;

    }

}
