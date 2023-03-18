package recursion_remove_duplicates;

public class solution {

   public static String res="";
   public static boolean []map=new boolean[26];
    public static void removeDuplicated(String str,int n,int i)
    {


        if(i==n)
        {
            System.out.print(res);
            return;
        }
        char curr_char=str.charAt(i);
        if(map[curr_char-'a'])
        {
            removeDuplicated(str,n,i+1);
        }
        else
        {
            res+=curr_char;
            map[curr_char-'a']=true;
            removeDuplicated(str,n,i+1);
        }

    }

    public static void main(String[] args) {
        String str="abcbbsgyhdgywbbcssa";
        int n=str.length();
        int i=0;
        removeDuplicated(str,n,i);
    }


}
