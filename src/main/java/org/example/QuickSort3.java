package org.example;

public class QuickSort3 {

    public static void quickSort(int[] arr, int start, int end) {
        // 피벗 값과 시작점, 끝점을 설정한다
        int part = partition(arr, start, end);
        if(start < part - 1) quickSort(arr, start, part-1);
        // 좌측에서는 pivot보다 큰 값을 우측에서는 pivot 보다 작은 값을 찾는다.
        if(end > part) quickSort(arr, part, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while(start <= end) {
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end) {
                swap(arr, start, end);
                // 각각 좌,우측에서 큰 값, 작은 값을 찾았으면, 두 값을 SWAP 해준다.
                start++;
                // SWAP 이후에는 point를 각각 좌, 우측으로 한 칸씩 이동해준다. End > Start가 되어 모든 파티션의 정렬이 종료될 때까지 반복한다.
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        return;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 3, 5};
		QuickSort3.quickSort(arr, 0, arr.length - 1);
    }
}