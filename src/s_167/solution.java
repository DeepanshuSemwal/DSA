package s_167;

import java.util.Stack;

public class solution {

    int celebrity(int M[][], int n)
    {
        // code here
        // put all the elements in the stack
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(i);
        }
        // take out 2 elements until stack size become equal to 1 and compare them wether they know each other or not

        while(stack.size()>1){
            int a= stack.pop();
            int b =stack.pop();
            if(M[a][b]==0)  // a dont know b
            {
                stack.push(a);

            }
            else if(M[b][a]==0)  // b dont know a
            {
                 stack.push(b);
            }

        }
        if(stack.size()==0)
        {
            return -1;
        }
        int ans= stack.pop();    // potentail candidate
        // checking wheter it is an canditate or not
        for(int j=0;j<n;j++) // checking for row
        {
            if(M[ans][j]==1) return -1;
        }
        for(int i=0;i<n;i++)  // checking for column
        {
            if(i==ans) continue;  // diagnoal element
            if(M[i][ans]==0) return -1;
        }

        return ans;
    }
}
