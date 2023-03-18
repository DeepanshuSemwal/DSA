package first_last_occurence;

public class oslu {

    // first and last ocuurence of character
    public static int first=-1;
    public static int last=-1;

    public static void occurence(String str,char element,int i)
    {
        // handling a base case
        int n=str.length();
        if(i==n)
        {
            System.out.println(first);
            System.out.println(last);
           return;
        }
        char cur_element=str.charAt(i);
        if(cur_element==element)
        {
            if(first==-1)
            {
                first=i;
            }
            else
            {
                last=i;
            }
        }
        occurence(str,element,i+1);

    }

    public static void main(String[] args) {
        String str="asdeytyiopaasb";
        int n=str.length();
        int i=0;
        occurence(str,'a',i);

    }
}
