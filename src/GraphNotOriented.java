public class GraphNotOriented<T> extends Graph<T> {

    @Override
    public void addEdge(T start, T dest, float weight) {
        nodes.get(start).addAdj(nodes.get(dest), weight);
        nodes.get(dest).addAdj(nodes.get(start), weight);
    }
}
