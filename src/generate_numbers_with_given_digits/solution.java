package generate_numbers_with_given_digits;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    public static void GenerateDigits(int n)
    {
        Queue<String >queue=new LinkedList<>();
        queue.add("5");
        queue.add("6");
        for(int i=0;i<n;i++)
        {
            String cur=queue.poll();
            queue.add(cur+"5");
            queue.add(cur+"6");
        }
    }

    //  Generate Binary Numbers
    static ArrayList<String> generate(int N)
    {
        // Your code here
        ArrayList<String>res=new ArrayList<>();
        Queue<String>queue=new LinkedList<>();
        queue.add("1");

        for(int i=0;i<N;i++)
        {
            String cur=queue.poll();
            res.add(cur);
            queue.add(cur+"0");
            queue.add(cur+"1");

        }
        return res;
    }
}
