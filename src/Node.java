import java.util.HashMap;

public class Node<T> {
    private final T value;
    private final HashMap<Node<T>,Float > adjacencies = new HashMap<>(); // float is the weight of the arch

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
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Value: %5s| Adjacencies:\n", this.value));

        adjacencies.forEach((key, value) -> sb.append(String.format(
                "%25s[Value: %5s | Weight: %2s]\n",
                " ",
                key.getValue(),
                value
        )));
        return sb.toString();
    }
}
