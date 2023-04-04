package tree_map;

import java.util.Map;
import java.util.TreeMap;

public class solution {

    public static void main(String[] args) {

        TreeMap<Integer,String>map=new TreeMap<>();
        map.put(10,"gfg");
        map.put(11,"leetcode");
        map.put(15,"luke");
        System.out.println(map.remove(11));
        for(Map.Entry<Integer,String>e:map.entrySet())
        {
            System.out.println(e.getValue());
            System.out.println(e.getKey());
        }
    }
}
