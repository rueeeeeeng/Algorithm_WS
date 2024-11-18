package inhatc.cse.algorithm.etc.graph.topological;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class Graph {
    ArrayList<Node> nodeList = new ArrayList<Node>();

    int[][] adjMatrix; //인접 행렬

    public Graph(ArrayList<Node> nodeList) {
        this.nodeList = nodeList;
        adjMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i, int j){ // 양방향성 간선
        adjMatrix[i][j] = 1;
        adjMatrix[j][i] = 1;
    }

    public void addDirectedEdge(int i, int j){ // 단방향성 간선
        i = i -'A';
        j = j - 'A';
        adjMatrix[i][j] = 1;
    }

    @Override
    public String toString(){
        System.out.println("=== 인접 행렬 ===");
        StringBuilder sb = new StringBuilder();
        sb.append("    ");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName() + "   ");

        }
        sb.append("\n");
        for (int i = 0; i < nodeList.size(); i++) {
            sb.append(nodeList.get(i).getName());
            for (int j : adjMatrix[i]) {
                sb.append(j + "  ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public void topologicalSort(){
        Stack<Node> stack = new Stack<>();
        for (Node node : nodeList) {
            if(!node.isVisited()){
                topologicalVisit(node, stack);
            }
        }

        while(!stack.empty()){
            System.out.print(stack.pop().getName() + " ");
        }
    }

    private void topologicalVisit(Node node, Stack<Node> stack) {
        ArrayList<Node> neighbors = getNeighbors(node);
        for (Node neighbor : neighbors) {
            topologicalVisit(neighbor, stack);
        }
        node.setVisited(true);
        stack.push(node);
    }

    private ArrayList<Node> getNeighbors(Node node) {
        ArrayList<Node> neighbors = new ArrayList<>();
        int index = node.getIndex();
        for (int i = 0; i < adjMatrix.length; i++) {
            if(adjMatrix[index][i] == 1){
                neighbors.add(nodeList.get(i));
            }
        }
        return neighbors;
    }
}
