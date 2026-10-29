import java.util.HashMap;

public class Graph<T> {
    private HashMap<T, Node<T>> nodes;

    public Graph(){
    }

    public void addNode(Node<T> n){
        if(!nodes.containsKey(n.getValue())){
            nodes.put(n.getValue(), n);
        }
        if (nodes.containsKey(n.getValue())) IO.println("Element already inside the graph.");
    }


}
