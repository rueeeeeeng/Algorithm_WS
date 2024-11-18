package inhatc.cse.algorithm.search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {28,40,56,63,74,87,95};
        int start = 0;
        int end = arr.length -1;

        // binarySearch() 배열, 내가 찾을 값 전달, 시작, 끝  --> 결과 값 화면에 출력
        int find = 74;
        int result = binarySearch(arr,start,end,find);
        System.out.println("검색 결과 위치는(-1, index) : " + result +", "+arr[result]);

    }

    public static int binarySearch(int[] arr,int start, int end, int find){
        int mid = (start+end)/2;
        for (int i = 0; i < arr.length; i++) {
            if(find == arr[mid])
                return mid;
            if(find < arr[mid]) //x값이 중간 값보다 작을 때 -> 왼쪽으로 가야함
                return binarySearch(arr, start, mid-1, find);
            else
                return binarySearch(arr, mid+1, end, find);
        }

        return mid;
    }
}
