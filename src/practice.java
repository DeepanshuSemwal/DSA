//import java.util.*;
//
//public class practice {
//
//    public static void main(String[] args) {
//
//
//
//
//    }
//
//    public static Node fun(Node head)
//    {
//        Node dummy=new Node(-1);
//        Node prev=dummy;
//        Node cur=head;
//        while(cur!=null && cur.next!=null)
//        {
//            prev.next=cur.next;
//            cur.next=cur.next.next;
//            prev.next.next=cur;
//            cur=cur.next;
//            prev=prev.next.next;
//
//        }
//        return dummy.next;
//    }
//
//    public static Node clone(Node head)
//    {
//        Node cur=head;
//        while(cur!=null)
//        {
//           Node temp=cur.next;
//            cur.next=new Node(cur.data);
//            cur.next.next=temp;
//            cur=temp;
//
//        }
//        cur=head;
//
//        while(cur!=null)
//        {
//            if(cur!=null)
//            cur.next.random=(cur.random==null)?null:cur.random;
//            cur=cur.next.next;
//        }
//        // segregate
//        Node original=head;
//        Node copy=head.next;
//        Node temp=copy;
//        while(original!=null)
//        {
//            original.next=original.next.next;
//            copy.next=copy.next.next;
//            original=original.next;
//            copy=copy.next;
//        }
//        return temp;
//
//
//    }
//
//
//
//
//
//
//
//}
//
//
//
//public class Result {
//    public static String getPhoneNumber(String s) {
//        Map<String, String> wordToDigit = new HashMap<>();
//        wordToDigit.put("zero", "0");
//        wordToDigit.put("one", "1");
//        wordToDigit.put("two", "2");
//        wordToDigit.put("three", "3");
//        wordToDigit.put("four", "4");
//        wordToDigit.put("five", "5");
//        wordToDigit.put("six", "6");
//        wordToDigit.put("seven", "7");
//        wordToDigit.put("eight", "8");
//        wordToDigit.put("nine", "9");
//
//        String[] words = s.split(" ");
//        StringBuilder result = new StringBuilder();
//        String prevDigit = null;
//        int digitCount = 0;
//
//        for (String word : words) {
//            if (wordToDigit.containsKey(word)) {
//                String digit = wordToDigit.get(word);
//                if (digit.equals(prevDigit)) {
//                    digitCount++;
//                    if (digitCount == 2) {
//                        result.deleteCharAt(result.length() - 1); // Remove the previous digit
//                        result.append("double");
//                    } else if (digitCount == 3) {
//                        result.deleteCharAt(result.length() - 1); // Remove the previous digit
//                        result.append("triple");
//                    } else if (digitCount > 3) {
//                        result.deleteCharAt(result.length() - 1); // Remove the previous digit
//                        result.append("double " + "triple".repeat(digitCount - 3));
//                    } else {
//                        result.append(digit);
//                    }
//                } else {
//                    digitCount = 1;
//                    result.append(digit);
//                    prevDigit = digit;
//                }
//            } else {
//                prevDigit = null;
//            }
//        }
//
//        return result.toString();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
