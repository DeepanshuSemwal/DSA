package s_296;

public class solution {

    int countTriangle(int graph[][],int V, boolean isDirected)
    {
        int total_count=0;
        for(int i=0;i<V;i++)
        {
            for(int j=0;j<V;j++)
            {
                for(int k=0;k<V;k++)
                {
                    if(graph[i][j]==1 && graph[j][k]==1 && graph[k][j]==1)
                    {
                        total_count++;
                    }
                }
            }

        }
        if(isDirected==true)
        {
            return total_count/3;
        }
        else
        {
            return total_count/6;
        }
    }
}
