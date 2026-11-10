import java.util.HashMap;

public abstract class Graph<T> {
    protected HashMap<T, Node<T>> nodes;

    public Graph(){
    }

    public void addNode(T value){
        if(!nodes.containsValue(value)){
            nodes.put(value,new Node<>(value));
        }else IO.println("Element already inside the graph.");
    }

    public void addEdge(T start, T dest, float weight){
        nodes.get(start).addAdj(nodes.get(dest), weight);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        this.nodes.forEach(
                (key, value) -> sb.append(key).append(": ").append(value.toString()).append("\n"));
        return sb.toString();
    }
}
