package s_45;

import java.util.Scanner;
public class solution {


    public static String mobileNumber(String str[],String s)
    {
        String res="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                res+="0";
            }
            else
            {
                int pos=s.charAt(i)-'A';
                res+=str[pos];
            }
        }
        return res;

    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str[] = {
                "2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999",
        };
        System.out.println("Enter the string");
        String s=sc.nextLine();

        System.out.println(mobileNumber(str,s));
        }
    }

