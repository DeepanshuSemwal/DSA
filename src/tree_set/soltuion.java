package tree_set;

import java.util.Iterator;
import java.util.TreeSet;

public class soltuion {

    public static void main(String[] args) {
        TreeSet<String>set=new TreeSet<>();
        set.add("gfg");
        set.add("course");
        set.add("hello");
        Iterator<String>it=set.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        // lower function : largergest value that is lower than the given value
        // higher : smallest value that is greater than given value
        // floor and ceil
        // if vale dont exist then it will return null
    }
}
