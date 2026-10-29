import java.util.HashMap;

public class Node<T> {
    private final T value;
    private HashMap<Node<T>, Integer> adjacencies; // Integer is the weight of the arch

    public Node(T value){
        this.value = value;
    }

    public void addAdj(Node<T> node, int weight){
        adjacencies.put(node, weight);
    }

    public T getValue() {
        return this.value;
    }

    @Override
    public String toString(){
        return String.format(
                "| Node: %3s | --%3s-- | Node: %3s |"
        );
    }
}
