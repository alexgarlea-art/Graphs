import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    private final char name;
    private ArrayList<Adjacency> adjacencies;

    public Node(char name){
        this.name = name;
    }

    public char getName() {
        return name;
    }

    public void addAdj(Node n, int weight){
        adjacencies.add(new Adjacency(n,weight));
    }

    public void rmAdj(Node node){
        for (Adjacency a : adjacencies){
            if(a.getNode() == node){
                adjacencies.remove(a);
                break;
            }
        }
    }

}
