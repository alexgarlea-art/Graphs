import java.util.HashMap;

public abstract class Graph<T> {
    protected HashMap<T, Node<T>> nodes;

    public Graph(){
    }

    public void addNode(T value){
        if(!nodes.containsKey(n)){
            nodes.put();
        }else IO.println("Element already inside the graph.");
    }

    public void addEdge(T start, T dest, float weight){
        nodes.get(start).addAdj(nodes.get(dest), weight);
    }
}
