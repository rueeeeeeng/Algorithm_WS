package inhatc.cse.algorithm.dynamic;

public class FloydPath {
    static final int INF = 999;

    private static int[][] allPairShortestPath(int[][] W) {
        int size = W.length;
        int[][] D = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0 ; j < W[0].length; j++) {
                D[i][j] = W[i][j];
            }
        }
        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    D[i][j] = Math.min(D[i][j] , D[i][k] + D[k][j]);
                }
            }
            System.out.println("\n\n K : "+ (k + 1));
            printArray(D);
        }

        return D;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0,INF,2,INF},
                {1,0,INF,INF},
                {INF, 8, 0, 3},
                {6, 4, INF, 0}
        };
        printArray(graph);
        int[][] D = allPairShortestPath(graph);
        System.out.println("\n");
        printArray(D);

    }

    private static void printArray(int[][] D) {
        for (int[] ints : D) {
            for (int el : ints) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }


}
