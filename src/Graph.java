import java.util.HashMap;

public class Graph {
    private HashMap<Character, Node> nodes;

    public Graph(){
    }

    public void addNode(Node n){
        nodes.put(n.getName(), n);
        if (nodes.containsKey(n.getName())) IO.println("Element already inside the graph.");
    }


}
