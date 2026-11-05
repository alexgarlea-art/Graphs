import java.util.HashMap;

public abstract class Graph<T> {
    private HashMap<T, Node<T>> nodes;

    public Graph(){
    }

    public void addNode(Node<T> n){
        if(!nodes.containsKey(n.getValue())){
            nodes.put(n.getValue(), n);
        }else IO.println("Element already inside the graph.");
    }

    public void addEdge(Node<T> start, Node<T> dest, float weight){
        start.addAdj(dest, weight);
    }
}
