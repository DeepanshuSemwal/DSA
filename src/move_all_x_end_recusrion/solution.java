package move_all_x_end_recusrion;

public class solution {

    public static int count=0;
    public static String res="";
    public static void moveX(String str,int n,int i)
    {

       if(i==n)
       {
           for(int j=0;j<count;j++)
           {
               res+='x';
           }
           System.out.print(res);
           return;
       }

       char cur_char=str.charAt(i);
       if(cur_char=='x')
       {
           count++;
           moveX(str,n,i+1);
       }
       else
       {
           res+=cur_char;
           moveX(str,n,i+1);
       }


    }

    public static void main(String[] args) {
      String str="abxnuihxxxxygyftfxtftx";
      int n=str.length();
      int i=0;
      moveX(str,n,i);
    }
}
