package s_192;

public class solution {

    static String smallestNumber(int S, int D){
        // code here
        String res="";
        if(9*D>S)
        {
            return "-1";
        }

        for(int i=D-1;i>=0;i--)
        {

            if(S>9)
            {
                res='9'+res;
                S-=9;
            }
            else
            {
                if(i==0) // we have only one slot to fill
                {
                        res=Integer.toString(S)+res;
                }
                else  // more slots are avaible
                {
                    res=Integer.toString(S-1)+res; // example if i have 8 then i fill 7 and then fill 1 to the first and zero between 1 and 7
                    i--;
                    while(i>0)
                    {
                        res='0'+res;
                        i--;
                    }
                    res='1'+res;
                    break;

                }

                }
            }
        return res;
        }


}
