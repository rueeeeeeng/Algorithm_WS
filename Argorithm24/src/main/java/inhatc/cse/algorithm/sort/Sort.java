package inhatc.cse.algorithm.sort;

public class Sort {
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = 1; j < arr.length; j++) {
                    
            }
        }
        return arr;
    }


    public static void insertElement(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insertElement = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > insertElement){
                arr[j+1]  = arr[j];
                j--;
            }
            arr[j+1] = insertElement;
        }
    }

    public static void Heapsort(int[] arr) {
        int eh =  arr.length-1;
        buildHeap(arr, eh);
        while(eh > 1){
            int temp = arr[1];
            arr[1] = arr[eh];
            arr[eh] = temp;

        }
        eh--;
        pushDown(arr, 1, eh/2, eh);
    }

    private static void pushDown(int[] arr, int x, int bh, int eh) {

    }


    private static void buildHeap(int[] arr, int eh) {

    }

}
