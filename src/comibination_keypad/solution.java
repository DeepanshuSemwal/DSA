package comibination_keypad;

public class solution {

    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombination(String str,String combination,int n,int i)
    {
        // doubt in this code
        if(i==n)
        {
            System.out.println(combination);
            return;
        }
        char cur_char=str.charAt(i);
        String mapping=keypad[cur_char-'0'];
        for(int j=0;i< mapping.length();j++)
        {
            printCombination(str,mapping.charAt(j)+combination,n,i+1);

        }

    }

    public static void main(String[] args) {
        String str="23";
        String combination="";
        int i=0;
        int n=str.length();
        printCombination(str,combination,n,i);

    }

}
