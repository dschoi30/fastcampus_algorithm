package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort2 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(in.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, n - 1, idx - 1);
        System.out.println(arr[idx - 1]);
    }

    public static void quickSort(int[] arr, int lt, int rt, int idx) {
        if(lt < rt) {
            int pivot = partition(arr, lt, rt);
            if(pivot == idx) return;
            else if(idx < pivot)
                quickSort(arr, lt, pivot - 1, idx);
            else
                quickSort(arr, pivot + 1, rt, idx);
        }
    }

    public static int partition(int[] arr, int lt, int rt) {
        int mid = (lt + rt) / 2;
        swap(arr, lt, mid);
        int pivot = arr[lt];
        int p1 = lt, p2 = rt;
        while(p1 < p2) {
            while(pivot < arr[p2]) p2--;
            while(p1 < p2 && pivot >= arr[p1]) p1++;
        }
        swap(arr, p1, p2);
        arr[lt] = arr[p1];
        arr[p1] = pivot;
        return p1;
    }

    public static void swap(int[] arr, int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
