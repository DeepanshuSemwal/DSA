import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        //divisor(10);
    //    System.out.println(fun(25));

    }

    public static void sort012(int arr[], int n) {
        // code here
        // sort 0,1,2
        // dutch national flag algorithm
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp2 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp2;
                    high--;
                    break;
            }
        }

    }

    public static void divisor(int n) {
        boolean isPrime[] = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i] == true) {
                for (int j = i * 2; j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
            }
        }

    }

    public static int fun(int arr[], int n) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else if (arr[mid] < arr[mid + 1]) {
                    low = mid + 1;
                } else if (arr[mid] < arr[mid - 1]) {
                    high = mid - 1;
                }
            } else if (mid == 0) {
                if (arr[mid] > arr[mid + 1]) {
                    return arr[mid];
                } else {
                    return arr[1];
                }
            } else if (mid == n - 1) {
                if (arr[mid] > arr[n - 2]) {
                    return arr[mid];
                } else {
                    return arr[n - 2];
                }

            }

        }
        return -1;
    }

public void fun(ListNode head, int x)
{
    ListNode prev=null;
    ListNode cur=head;
    while(cur!=null)
    {
        ListNode next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
    }
}

}


class ListNode
{
    int data;
    ListNode next;
    ListNode prev;
    ListNode(int d)
    {
        data=d;
        next=null;
        prev=null;
    }
}





