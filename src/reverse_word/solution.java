package reverse_word;

public class solution {

    public static void reverse(String str)
    {
        int start=0;
        int n=str.length()-1;
        for(int end=0;end<str.length();end++)
        {
            if(str.charAt(end)==' ')
            {
                reverse(str,start,end-1);
                start=end+1;
            }

        }
        reverse(str,start,n-1);
    }
    public static void reverse(String str,int i,int j)
    {
       int low=0;
       int high=str.length()-1;
       char charArray[]=str.toCharArray();
       while(low<high)
       {
           char temp=charArray[i];
           charArray[i]=charArray[j];
           charArray[j]=temp;
           low++;
           high--;
       }
    }

    }






