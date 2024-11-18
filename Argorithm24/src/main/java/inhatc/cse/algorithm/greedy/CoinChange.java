package inhatc.cse.algorithm.greedy;

public class CoinChange {

    public static void main(String[] args) {
        int[] coinValue = {500, 100, 50, 10, 5,1 };

        int count = coinChange(coinValue, coinValue.length, 654);

        System.out.println(count);
    }

    private static int coinChange(int[] d, int m, int n) {
        int count = 0;
        int i = 0;
        while(n>0 && i<=m){
            count = count+n/d[i];
            n=n%d[i];
            i=i+1;
        }
        return count;
    }

}
