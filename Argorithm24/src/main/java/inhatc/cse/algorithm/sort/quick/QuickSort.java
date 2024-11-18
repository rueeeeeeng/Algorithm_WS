package inhatc.cse.algorithm.sort.quick;

import java.util.Arrays;

public class QuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int pivot = partition(arr, low, high);
            System.out.println("피벗 : "+pivot);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("\n");
            quickSort(arr, low, pivot-1);
            quickSort(arr,pivot+1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int i = low +1;
        int j = high;

        while(i<=j){
            if(arr[i] <= arr[low]){
                i++;
            }else if(arr[j]>arr[low]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;
        return j;
    }


    public static void main(String[] args) {
        QuickSort qs = new QuickSort();
        int[] arr = {15,22,13,27,12,10,20,25};


        Arrays.stream(arr).sorted().forEach(System.out::println);

        qs.quickSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
