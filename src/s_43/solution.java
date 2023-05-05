package s_43;

public class solution {

    public String removeConsecutiveCharacter(String S){


        String res="";
        res+=S.charAt(0);
        for(int i=1;i<S.length();i++)
        {
           if(S.charAt(i)!=S.charAt(i-1))
           {
               res+=S.charAt(i);
           }
        }
        return res;

    }
}
