public class Adjacency {
    private Node node;
    private int weight;

    public Adjacency() {
    }

    public Node getNode() {
        return node;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return String.format(
                "{%1s,%2s}\n",
                this.node,
                this.weight
        );
    }
}
