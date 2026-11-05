import java.util.HashMap;

public class Node<T> {
    private final T value;
    private HashMap<Node<T>,Float > adjacencies; // float is the weight of the arch

    public Node(T value){
        this.value = value;
    }

    protected void addAdj(Node<T> node, float weight){
        adjacencies.put(node, weight);
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        this.adjacencies.forEach(((node, floating) -> {
            sb.append(this.value).append(", ").append(node.value).append(", ").append(floating);
        }));
        return sb.toString();
    }
}
