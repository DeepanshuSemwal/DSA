package longest_subsequence_with_k_uniquehcarcter;

import java.util.*;

public class solution {

    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = s.length();
        int res = -1;
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
            if (map.size() < k) {
                j++;
            } else if (map.size() == k) {
                res = Math.max(res, (j - i + 1));// window length : j-i+1
                j++;
            } else if (map.size() > k) {
                while (map.size() > k) {
                    if (map.containsKey(s.charAt(i))) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    }
                    if (map.get(s.charAt(i)) == 0) {
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
            }
        }
        return res;
    }

    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        Arrays.sort(hand);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < hand.length; i++) {
            if (map.containsKey(hand[i])) {
                map.put(hand[i], map.get(hand[i]) + 1);
            } else {
                map.put(hand[i], 1);
            }
        }

        for (int i = 0; i < hand.length; i++) {
            if (map.containsKey(hand[i])) {
                for (int j = hand[i]; j < hand[i] + groupSize; j++) {
                    if (!map.containsKey(j)) {
                        return false;
                    }
                    map.put(j, map.get(j) - 1);
                    if (map.get(j) == 0) {
                        map.remove(j);
                    }
                }
            }
        }
        return true;

    }

    public static int findMoves(int n, int[] chairs, int[] passengers) {
        // code here

        int i=0;
        int j=0;
        Arrays.sort(chairs);
        Arrays.sort(passengers);
        int res=0;
        while(i<n && j<n)
        {
            res=Math.abs(chairs[i]-passengers[j]);
            i++;
            j++;
        }
        return res;
    }

}










