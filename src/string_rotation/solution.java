package string_rotation;

public class solution {

    public static boolean checkRoatation(String s1,String s2)
    {
        String s3=s1+s1;
        if(s1.length()!=s2.length())
        {
            return false;
        }
        return s3.indexOf(s2)>=0;
    }
}
