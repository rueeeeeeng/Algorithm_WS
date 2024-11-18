package inhatc.cse.algorithm.sort;

import java.util.Arrays;

public class SortMain {
    public static void main(String[] args) {
        int[] arr = {72, 60, 83, 47, 89, 95};
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();

//        int[] sortedArr = Sort.selectionSort(arr);
//        int[] sortedArr = Sort.insertElement(arr);
        Sort.insertElement(arr);
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();


    }
}
