package s_166;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class solution {


    // use String builder to pass all test cases in gfg
    public String FirstNonRepeating(String A)
    {
        // code here
        HashMap<Character,Integer>map=new HashMap<>();
        Queue<Character>queue=new LinkedList<>();
        String res="";
        for(int i=0;i<A.length();i++)
        {
            char ch= A.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
            queue.add(ch);
            while(!queue.isEmpty())
            {
                if(map.get(queue.peek())>1)
                {
                    queue.poll();
                }
                else
                {
                    res+=queue.peek();
                    break;
                }
            }
            if(queue.isEmpty()) // it means there is no non repeatingh element
            {
                res+='#';
            }

        }
        return res;

    }


    public String FirstNonRepeating2(String A)
    {
        // code here
        Map<Character, Integer> m = new HashMap<>();
        StringBuilder ans = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            q.add(ch);
            m.put(ch, m.getOrDefault(ch, 0) + 1);

            while (!q.isEmpty()) {
                if (m.get(q.peek()) > 1) {
                    q.poll();
                } else {
                    ans.append(q.peek());
                    break;
                }
            }

            if (q.isEmpty()) {
                ans.append('#');
            }
        }

        return ans.toString();

    }
}
