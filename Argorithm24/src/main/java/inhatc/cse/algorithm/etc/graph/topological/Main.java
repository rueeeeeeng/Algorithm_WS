package inhatc.cse.algorithm.etc.graph.topological;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodeList = new ArrayList<>();
        nodeList.add(new Node("1", 0));
        nodeList.add(new Node("2", 1));
        nodeList.add(new Node("3", 2));
        nodeList.add(new Node("4", 3));
        nodeList.add(new Node("5", 4));
        nodeList.add(new Node("6", 5));
        nodeList.add(new Node("7", 6));

        Graph g = new Graph(nodeList);
        g.addDirectedEdge('1', '2');
        g.addDirectedEdge('1', '4');
        g.addDirectedEdge('2', '4');
        g.addDirectedEdge('2', '6');
        g.addDirectedEdge('3', '4');
        g.addDirectedEdge('3', '5');
        g.addDirectedEdge('4', '6');
        g.addDirectedEdge('5', '6');
        g.addDirectedEdge('5', '7');
        g.addDirectedEdge('6', '7');

        System.out.println(g);

        g.topologicalSort();
    }
}
