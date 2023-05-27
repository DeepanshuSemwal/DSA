package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Heap {

    int arr[];
    int size;
    int capcity;
    Heap(int c)
    {
        arr=new int[c];
        size=0;
    }
    int left(int i)
    {
        return 2*i+1;
    }
    int right(int i)
    {
        return 2*i+2;
    }
    int parent(int i)
    {
        return ((i-1)/2);
    }

    public void insert(int x)
    {
        if(size==capcity)
        {
            return;
        }
        size++;
        arr[size-1]=x;
        for(int i=size-1;i!=0 && arr[parent(i)]>arr[i];)
        {
            // swap parent and inserted node
            int temp=arr[parent(i)];
            arr[parent(i)]=arr[i];
            arr[i]=temp;
            i=parent(i);

        }

    }

    public void minHepify(int i)
    {
        int lt=left(i);
        int rt=right(i);
        int smallest=i;
        if(lt<size && arr[lt]<arr[i])
        {
            smallest=lt;
        }
        if(rt<size && arr[rt]<arr[smallest])
        {
            smallest=rt;
        }
        if(smallest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
            minHepify(smallest);
        }
    }
    public int extractMin()
    {
        if(size==0)
        {
            return Integer.MAX_VALUE;
        }
        if(size==1)
        {
            size--;
            return arr[size];
        }
        int temp=arr[0];
        arr[0]=arr[size-1];
        arr[size-1]=temp;
        size--;
        minHepify(0);
        return arr[size];

    }

    public void decreaseKey(int i,int x)
    {
        arr[i]=x;
        while(i!=0 && arr[parent(i)]>arr[i])
        {
            int temp=arr[i];
            arr[i]=arr[parent(i)];
            arr[parent(i)]=temp;
            i=parent(i);
        }
    }

    public void buildHeap()
    {
        for(int i=(size-2)/2;i>=0;i--)
        {
            minHepify(i);
        }
    }

    public void maxHeapify(int arr[],int n,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<size && arr[left]>arr[largest])
        {
            largest=left;
        }
        if(right<size && arr[right]>arr[left])
        {
            largest=right;
        }
        if(largest!=i)
        {
            int temp=arr[largest];
            arr[largest]=arr[i];
            arr[i]=temp;
            maxHeapify(arr,n,largest);
        }
    }

    public void buildHeap(int arr[],int n)
    {
        for(int i=(n-2)/2;i>=0;i--)
        {
            maxHeapify(arr,n,i);
        }
    }
    public void heapSort(int arr[],int n)
    {
        buildHeap(arr, n);
        for(int i=n-1;i>=0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            maxHeapify(arr,n,0);
        }
    }




}
