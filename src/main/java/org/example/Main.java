package org.example;

import java.util.Arrays;

public class Main {

    public static void quickSort(int[] arr, int start, int end) {
        int part = partition(arr, start, end);
        if(start < part - 1) quickSort(arr, start, part - 1);
        if(end > part) quickSort(arr, part, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = (start + end) / 2;
        while(start < end) {
            if(arr[start] < pivot) start++;
            if(arr[end] > pivot) end--;
            swap(arr, start, end);
            start++;
            end--;
        }

        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 5};
		Main.quickSort(arr, 0, arr.length - 1);
        for(int x : arr) {
            System.out.print(x + " ");
        }
    }
}