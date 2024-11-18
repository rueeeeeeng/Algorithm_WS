package inhatc.cse.algorithm.etc.graph.topological;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class Node {
    private String name;
    private  int index;
    private boolean visited;

    public Node(String name, int index){
        this.name = name;
        this.index = index;
        this.visited = false;
    }

}
