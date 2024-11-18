package inhatc.cse.algorithm.dynamic;

import java.util.Arrays;

public class RodCutting {

    private int cutRod_DP(int[] priceArray, int n){
        //int[] priceArray = {10, 15,40,45,50,55,55}
        int maxSell[] = new int[n+1];
        maxSell[0] = 0;

        for (int j = 0; j <= n; j++) {
            int maxVal = 0;

            for (int k = 1; k <= j; k++){
                maxVal = Math.max(maxVal, priceArray[k-1] + maxSell[j-k]);
            }
            maxSell[j] = maxVal;

            Arrays.stream(maxSell).forEach(x -> System.out.print(x + " "));
            System.out.println();

        }
        return maxSell[n];
    }

    public static void main(String[] args) {
        //int[] priceArray = {10, 15,40,45,50,55,55};
        int[] priceArray = {2, 5, 9, 10};
        RodCutting rc = new RodCutting();
        System.out.println("동적 계획을 이용하여 구한 최대 판매 금액 : " + rc.cutRod_DP(priceArray,priceArray.length));
    }
}
