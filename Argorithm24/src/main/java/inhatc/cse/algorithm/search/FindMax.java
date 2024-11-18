package inhatc.cse.algorithm.search;

public class FindMax {


/*    public static void main(String[] args) {
        int arr[] = {72, 60, 83, 47, 89, 95};

        //findMaximum이 인스턴스 함수일 때 접근하는 방법(static x)
        *//*FindMax findMax = new FindMax();
        int result = findMax.findMaximum(arr);*//*
        int max = findMaximum(arr);


        System.out.println("최대값은 : " + max);
    }*/

    public static int findMaximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
