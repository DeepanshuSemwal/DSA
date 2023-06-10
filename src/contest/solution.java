package contest;

import java.util.Arrays;
import java.util.HashMap;

public class solution {

    private static void mergeAndCount(int[] arr, int l, int m, int r, HashMap<Integer, Integer> map) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int left[] = new int[n1];
        int right[] = new int[n2];
        int i = 0;
        int j = 0;
        int k = 0;
        for (int i1 = 0; i1 < n1; i1++) {
            left[i] = arr[l + i];
        }
        for (int i1 = 0; i1 < n2; i1++) {
            right[i] = arr[m + 1 + i];
        }
        int count = 0;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                map.put(left[i], map.getOrDefault(left[i], 0) + count);
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
                count++;
            }

        }

        while (i < left.length) {
            map.put(left[i], map.getOrDefault(left[i], 0) + count);
            arr[k++] = left[i++];
        }
        while (j < right.length)
            arr[k++] = right[j++];

    }

    public static void mergeSortAndCount(int[] arr, int l, int r, HashMap<Integer, Integer> map) {
        if (l < r) {
            int m = l + (r - l) / 2;


            // Left subarray
            mergeSortAndCount(arr, l, m, map);

            // Right subarray
            mergeSortAndCount(arr, m + 1, r, map);

            // Merge
            mergeAndCount(arr, l, m, r, map);
        }

    }

    public static HashMap<Integer, Integer> find(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int dup[] = new int[n];
        for (int i = 0; i < n; i++) {
            map.put(arr[i], 0);
            dup[i] = arr[i];
        }
        mergeSortAndCount(dup, 0, n - 1, map);
        return map;
    }





    public void Rearrange(int a[], int n)
    {
        // Your code goes here
        mergeSort(a, 0, n-1);
    }
    void mergeSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            int m = low + (high - low) / 2;

            mergeSort(arr, low, m);
            mergeSort(arr, m + 1, high);

            merge(arr, low, m, high);
        }
    }


    void merge(int arr[], int low, int mid, int high)
    {
        int i, j, k;
        int n1 = mid - low + 1;
        int n2 = high - mid;


        int left[] = new int[n1];
        int right[] = new int[n2];
        for (i = 0; i < n1; i++)
        {
            left[i] = arr[low + i];
            for (j = 0; j < n2; j++)
            {
                right[j] = arr[mid + 1 + j];
            }
            i = 0;
            j = 0;
            k = low;
            while (i < n1 && left[i] < 0)
            {
                arr[k] = left[i];
                k++;
                i++;
            }

            while (j < n2 && right[j] < 0)
            {
                arr[k] = right[j];
                k++;
                j++;
            }

            while (i < n1)
            {
                arr[k] = left[i];
                i++;
                k++;
            }

            while (j < n2)
            {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

    }





















}






