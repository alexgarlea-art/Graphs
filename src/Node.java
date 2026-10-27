import java.util.ArrayList;

public class Node {
    private final String name;
    private ArrayList<Adjacency> adjacencies;

    public Node(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addArch(Node n, int weight){
        adjacencies.add(new Adjacency(n,weight));
    }
}
