package inhatc.cse.algorithm.greedy;

public class PrimMST {
    public static final int INF = 999;

    private void redBlueMST(int[][] W, int n) {
        int[] near = new int[n]; //가장 가까운 적색정점의 집합
        boolean[] isBlue = new boolean[n]; // 청색인지 확인

        isBlue[0] = false;
        int newRed = 0;
        for (int i = 1; i < n; i++) {
            isBlue[i] = true;
            near[i] = 0;
        }

        for (int i = 1; i < n; i++) {
            int minVal = INF;
            for (int b = 0; b < n; b++) {
                if(isBlue[b] && W[b][near[b]]<minVal){
                    minVal = W[b][near[b]];
                    newRed = b;

                }
            }
            isBlue[newRed] = false;
            System.out.println("추가 간선 : "+(char)(near[newRed]+'a')+","+(char)(newRed+ 'a')+" : "+ minVal) ;
            // 청색 정점에 가장 가까운 적색 정점을 새로이 적색 정점이 된 정점을 반영해서 갱신
            for (int b = 0; b < n; b++) {
                if(isBlue[b] && W[b][newRed] < W[b][near[b]]){
                    near[b] = newRed;
                }
            }
        }
    }

    public static void main(String[] args) {


        PrimMST pm = new PrimMST();
        int[][] G = {
                {0, 2, INF, INF, 4},
                {2, 0, 8, INF, 4},
                {INF, 8, 0, 7, 6},
                {INF, INF, 7, 0, 3},
                {4, 4, 6, 3, 0}
        };
        pm.redBlueMST(G, G.length);

    }


}
