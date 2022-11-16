package Add_to_Array_Form_of_Integer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer>res=new ArrayList<>();
        int i=num.length-1;
        while(i>=0 || k>0)
        {
            if(i>=0)
            {
                res.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            }
            else
            {
                res.add(k%10);
                k=k/10;
            }
            i--;
    }
        Collections.reverse(res);
        return res;
}

}
