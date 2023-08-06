package interview;

public class solution {

  static   String res="";
    static boolean map[]=new boolean[26];
    public static void remove(String str,int i)
    {
        if(i==str.length())
        {
            System.out.println(res);
            return;
        }
        char cur_element=str.charAt(i);
        if(map[cur_element-'a']==false)
        {
            res+=cur_element;
            map[cur_element-'a']=true;
        }
       remove(str,i+1);

    }

    public static void main(String[] args) {

        String str="aaddededrt";
        int n=str.length();
        remove(str,0);

    }
}
